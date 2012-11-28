<%@page import="org.apache.catalina.Context"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="zeke.stage.constant.StageConstant.Request"%>
<%@ page import="zeke.stage.vo.ArticleVo"%>
<%@ page import="zeke.stage.entity.Article"%>
<%@ page import="zeke.stage.entity.ArticleMeta"%>
<%@ page import="zeke.stage.entity.ArticleSheet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	ArticleVo artilceVo = (ArticleVo) request
			.getAttribute(Request.KEY_ONE_ARTICLE);
	Article article = artilceVo.getArticle();
	ArticleMeta meta = article.getMeta();
	List<ArticleSheet> sheets = article.getSheets();
%>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/system/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/system/js/article-style-multible-sheet.js"></script>
</head>
<body>
	<c:forEach items="<%=sheets%>" var="sheet" varStatus="i">
		<div class="sheet">${sheet.content}</div>
	</c:forEach>
</body>
</html>