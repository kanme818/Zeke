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
<script type="text/javascript" src="/theme/default/js/jquery-1.8.2.js"></script>
<c:if test="meta.isMultibleSheet">
	<script type="text/javascript" src="<%=meta.getSheetStyle()%>"></script>
</c:if>
</head>
<body>
	<%@include file="jspf/header/header.jspf"%>
	<%@include file="jspf/content-category/content-category.jspf"%>
	<%@include file="jspf/sidebar/sidebar_typeA.jspf"%>
	<%@include file="jspf/footer/footer.jspf"%>
</body>
</html>