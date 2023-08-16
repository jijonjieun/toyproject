<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="./js/jquery-3.7.0.min.js"></script>
<script type="text/javascript">

</script>


</head>
<body style="background-color: #fffbe6;">

	<div class="lg-img">
		<img alt="" src="./img/Threads_logo.png" height="60px">
	</div>
	<br>
	<%@ include file="menu.jsp"%>
	<hr>

	마이페이지 꾸미기
	<div>${result.m_id }</div>
	${result.m_intro }
	
	
	
<button class ="profile" onclick="location.href='./profile'">프로필편집</button>


	
	<table>
			<c:forEach items="${mylist }" var="row">
				<tr>
				<tr>
					<td class="tid">${row.m_id }</td>
					<td class="tdate">${row.bdate }</td>
				</tr>
				<tr onclick="location.href='./comment?bno=${row.bno }'">
					<td class="tcont">${row.bcontent }</td>
				</tr>
				<tr>
					<td><img alt="" src="./img/like.png" height="20px"> 좋아요${row.blike }개  <img alt="" src="./img/comment.png" height="20px"> 답글${row.commentcount }개</td>
				</tr>
			</c:forEach>
		</table>

</body>
</html>