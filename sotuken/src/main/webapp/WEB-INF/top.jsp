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
<link href="css/top2.css" rel="stylesheet" type="text/css">
<title>トップページ</title>
</head>

<body class="a">

	<div class="container mt-5 pt-5 text-center">
		<h1 class="border-bottom border-dark">トップページ</h1>
	</div>

	<form action="toppage2" method="get">
		<h1 class="button-name text-center">
			<button type="submit" name="state" value="drag"
				class="baka btn-outline-danger">薬情報登録</button>
			<button type="submit" name="state" value="food"
				class="aho btn-outline-primary">食事時間登録</button>
		</h1>

		<h1 class="button-name text-center">
			<button type="submit" name="state" value="mypage"
				class="baka2 btn-outline-success">マイページ</button>
			<button type="submit" name="state" value="logout"
				class="aho2 btn-outline-warning">ログアウト</button>
		</h1>
	</form>
</body>