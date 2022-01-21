package dao;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import been.Drag;
import been.Food;
import been.ImageBean;
import been.Webapp;

/**
 * Servlet implementation class DAO
 */
@WebServlet("/DAO")
public class DAO extends HttpServlet {
	static DataSource ds;

	// --------------------------------------------------------------
	// --- データベースへのコネクションを貼るメソッド
	// --------------------------------------------------------------
	public Connection getConnection() throws Exception {
		if (ds == null) {
			InitialContext ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:/comp/env/jdbc/TeamA");
		}
		return ds.getConnection();
	}
	// --------------------------------------------------------------
		// --- productテーブルからキーワードに合致したデータを抽出し、そのリストを返却する
		// --------------------------------------------------------------
		public List<Webapp> search(String keyword) throws Exception {
			// --- 返却用リストの確保
			List<Webapp> ary = new ArrayList<Webapp>();

			// --- データベース接続
			Connection con = getConnection();

			// --- keywordがnullかどうかで、whereをつけるかどうかを判断してSQL文を作る
			String sql = "select * from product ";
			if (keyword != null) {
				sql = sql + " where name like ?";
			}

			// --- プリペアドステートメントへ登録
			PreparedStatement st = con.prepareStatement(sql);

			// --- where句がある（keywordがnullじゃない）場合は、値をセットする
			if (keyword != null) {
				st.setString(1, "%" + keyword + "%");
			}

			// --- クエリの結果を取得
			ResultSet rs = st.executeQuery();

			// --- 結果のリストをaryへ追加するための繰返し処理
			while (rs.next()) {
				// --- １件分のデータを格納するBeanを作成
				Webapp p = new Webapp();
				// --- Beanにクエリで得取得した値を設定（Beanのメソッドを利用）
				p.setName(rs.getString("name"));
				p.setAge(rs.getString("age"));
				p.setSex(rs.getString("sex"));
				p.setBirthday(rs.getString("birthday"));
				p.setEmail(rs.getString("email"));
				p.setPhone(rs.getString("phone"));
				p.setUserid(rs.getString("userid"));
				p.setPassword(rs.getString("passward"));
				p.setRepassword(rs.getString("repassward"));
				// --- Beanを配列aryに追加
				ary.add(p);
			}
			// --- オブジェクトを閉じる
			st.close();
			con.close();

			// --- 配列aryを返す
			return ary;
		}

		// 追加処理
		public int insertMember(Webapp product) throws Exception {
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("select count(*) as kosu from user where userid=?");
			pst.setString(1, product.getUserid());
			ResultSet rs = pst.executeQuery();
			rs.next();
			int kosu = rs.getInt("kosu");
			rs.close();
			pst.close();
			System.out.print("kosu");
			
			if(kosu==0) {
			PreparedStatement st = con.prepareStatement("insert into user(name,age,sex,birthday,email,phone,userid,password,repassword) values(?,?,?,?,?,?,?,?,?)");
			st.setString(1, product.getName());
			st.setString(2, product.getAge());
			st.setString(3, product.getSex());
			st.setString(4, product.getBirthday());
			st.setString(5, product.getEmail());
			st.setString(6, product.getPhone());
			st.setString(7, product.getUserid());
			st.setString(8, product.getPassword());
			st.setString(9, product.getRepassword());
			
			int line = st.executeUpdate();
			st.close();
			con.close();
			return line;
			
			}return 0;
		}
		
		public int insertDrag(Drag product) throws Exception {
			Connection con = getConnection();
			PreparedStatement st = con.prepareStatement("insert into Medicine(userid,m_date,kusurimei,zaigata,itinitiryou,youhou,zenryou)values(?,?,?,?,?,?,?)");
			st.setString(1, product.getUserid());
			Date date = new Date(); // 今日の日付
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = dateFormat.format(date);
			st.setString(2, strDate);
			st.setString(3, product.getKusurimei());
			st.setString(4, product.getZaigata());
			st.setString(5, product.getItinitiryou());
			st.setString(6, product.getYouhou());
			st.setString(7, product.getZenryou());
			
			int line = st.executeUpdate();
			st.close();
			con.close();
			return line;
		}
		
		public int insertTime(Food product) throws Exception {
			Connection con = getConnection();
			/*PreparedStatement pst = con.prepareStatement("select * as kosu from user where userid=?");
			pst.setString(1, product.getUserid());
			ResultSet rs = pst.executeQuery();
			rs.next();
			int kosu = rs.getInt("kosu");
			rs.close();
			pst.close();
			System.out.print("kosu");
			
			if(kosu==0) {*/
			PreparedStatement st = con.prepareStatement("update user set morning=?,noon=?,night=? where userid = ?");
			st.setString(1, product.getMorning());
			st.setString(2, product.getNoon());
			st.setString(3, product.getNight());
			st.setString(4, product.getUserid());
			
			int line = st.executeUpdate();
			st.close();
			con.close();
			return line;
			
			//}return 0;
		}
		
		public int uploadImage(ImageBean product) throws Exception{

			Connection con = getConnection();
			PreparedStatement st = con.prepareStatement("insert into photo(userid,photo_no,image) values(?,?,?)");

			st.setString(1, product.getUserid());
			Date date = new Date(); // 今日の日付
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = dateFormat.format(date);
			st.setString(2, strDate);
			st.setBinaryStream(3, new ByteArrayInputStream(product.getImage()));
			
			int line = st.executeUpdate();
			st.close();
			con.close();
			return line;
			}

}
