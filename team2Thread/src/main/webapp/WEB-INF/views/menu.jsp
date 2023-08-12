<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<link rel="stylesheet" href="./css/menu.css">
<nav>
	<ul>
		<li onclick="link('myinfo')"><img alt="" src="./img/home.png" height="50px"></li>
		<li onclick="link('search')"><img alt="" src="./img/search.png" height="50px"></li>
		<li onclick="link('write')"><img alt="" src="./img/edit.png" height="50px"></li>
		<li onclick="link('login')"><img alt="" src="./img/profile.png" height="50px"></li>
	</ul>
</nav>
<div style="height: 50px; width: 100%;"></div>

<script>
	function link(url) {
		location.href = "./" + url;
	}
</script>
