<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link href="css/main.css" rel="stylesheet">
<title>マイページ画面</title>
</head>
<body class="aths">
	<div class="container mt-3 pt-3 text-center ">
    	<h1>マイページ</h1>
	</div>

	<div class="container">
		<div class="row col-md">
			<form action="./mypage" method="post">
				  <label>氏名：</label>
				  <input type="text" name="name" value="" class="form-control" placeholder="氏名を入力してください"><br>
				  <label>年齢：</label>
				  <input type="number" name="age" value="" class="form-control" placeholder="年齢を入力してください"><br>
				  <label>性別：</label>
				  <select class="form-control">
                           <option>男性</option>
                           <option>女性</option>
                           <option>カスタム</option>
                     </select><br>
				  <label>生年月日：</label>
				  <input type="date" name="birthday" value="" class="form-control"><br>
				  <label>メールアドレス：</label>
				  <input type="email" name="email-address" value="" class="form-control" placeholder="xxxx@example.com"><br>
				  <label>電話番号：</label>
				  <input type="tel" name="telnumber" value="" class="form-control" placeholder="電話番号を入力してください"><br>
				  <label>ユーザーID：</label>
				  <input type="text" name="userID" value="" class="form-control" placeholder="ユーザーIDを入力してください"><br>
				  <label>パスワード：</label>
				  <input type="password" name="passward-1" value=""class="form-control"  maxlength="8" placeholder="〜8文字で入力"><br>
				  <label>確認用パスワード入力：</label>
				  <input type="password" name="passward-2" value="" class="form-control" maxlength="8" placeholder="〜8文字で入力"><br>
				  <div class="text-center">
				  	 <button type="submit" name="state" value="toppage" class="btn btn-primary btn-lg" >キャンセル</button>　
				  	 <button type="submit" name="state" value="mypage" class="btn btn-primary btn-lg" >　変更　</button>
				  </div>
			</form>
		</div>
	</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>
</html>