<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<script src="./js/jquery-3.7.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#pwch2").keyup(function() {

			let pwch1 = $("#pwch1").val();
			let pwch2 = $("#pwch2").val();

			if (pwch1 == pwch2) {
				$("#pwout").text('비밀번호가 일치합니다.');
			} else {
				$("#pwout").text('비밀번호가 일치하지 않습니다.');
			}

		});
	});
</script>
</head>
</head>
<body>

${dto.m_id } 님의 프로필

	<div class="write-div">
		<form action="./changeinfo" method="post">
			<input type="text" name="intro" id="intro" value="${dto.m_intro}">

			<button class="btn" type="submit">수정</button>
			<input type="hidden" name="id" value="${dto.m_id}">
		</form>
	</div>
</body>
</html>