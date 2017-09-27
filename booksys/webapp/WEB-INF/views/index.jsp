<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>项目管理系统欢迎界面</title>
</head>
<body>
	<div>
		<div>
			<jsp:include page="top.jsp" />
		</div>
		<div>
			<div style="float: left;">
				<jsp:include page="left.jsp" />
			</div>
			<div style="float: right;">
				<jsp:include page="mainfra.jsp" />
			</div>
		</div>
	</div>
</body>
</html>
