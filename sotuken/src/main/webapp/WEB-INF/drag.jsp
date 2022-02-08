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
<title>薬情報登録画面</title>
</head>
<body class="aths">
	<div class="container mt-3 pt-3 text-center ">
		<h1>薬情報登録</h1>
	</div>
	<div class="container">
		<div class="row col-md">
			<form action="./drag" method="post">
				<label>お薬名：</label> <input type="text" name="kusurimei"
					class="form-control" placeholder="お薬名を入力してください"><br> <label>剤型：</label>
				<input type="text" name="zaigata" class="form-control"
					placeholder="剤型を入力してください"><br> <label>一日量：</label> <input
					type="text" name="itinitiryou" class="form-control"
					placeholder="一日量を入力してください"><br> <label>用法：</label> <input
					type="text" name="youhou" class="form-control"
					placeholder="用法を入力してください"><br> <label>全量：</label> <input
					type="text" name="zenryou" class="form-control"
					placeholder="全量を入力してください"><br>
				<div class="text-center">
				  	 <button type="submit" name="state" value="toppage" class="btn btn-primary btn-lg" >キャンセル</button>　
				  	 <button type="submit" name="state" value="drag" class="btn btn-primary btn-lg" >　登録　</button>
				  </div>
			</form>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>