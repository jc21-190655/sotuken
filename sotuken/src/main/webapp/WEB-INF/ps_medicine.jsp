<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>撮影画面（食事）</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/ps_meal.css">
</head>
<body>

<header>
<h1 class="headline">
食事の写真を撮影しましょう！
</h1>
<p class="message">
今日の食事の写真を撮影しましょう。<br>
撮影したら撮った写真を送信しましょう。<br>
下のボタンで撮影、送信ボタンで送信できます。
</p>
</header>

<div class="contents">
<button type="button" class="shot_btn">撮影する</button><br>
<form action="" method="post"
enctype="multipart/form-data">
<input type="file" name="image" accept="image/*"><!--type="hidden"を入れる-->
<button type="submit" class="submit_btn">送信</button>
</form>
</div>
</body>
</html>