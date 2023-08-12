<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
프로필편집창 언제 하는데
{dto.m_intro}

	<div class="write-div">
		<form action="./password" method="post">
			<input type="text" name="btitle" value="${dto.btitle}">
			<textarea id="summernote" name="bcontent">"${dto.bcontent }"</textarea>
			<button class="btn100" type="submit">글수정</button>
			<input type="hidden" name="bno" value="${dto.bno}">
		</form>
		<!-- type="submit" => 제출버튼. 폼데이터로 데이터 전송 -->
	</div>



</body>
</html>