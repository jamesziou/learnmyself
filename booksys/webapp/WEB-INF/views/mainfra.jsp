﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>项目管理系统</title>
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 1px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #4AA3D8;
}

html {
	overflow-x:;
	overflow-y:;
	border: 0;
}
</style>
</head>

<body>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td bgcolor="#4AA3D8"></td>
		</tr>
		<tr>
			<td><table width="768" height="500" border="0" cellpadding="0"
					cellspacing="0">
					<tr>
						<td valign="top">
							<spring:url var="welcomeImages" value="/resources/images/welcome.gif" />
							<img src="${welcomeImages}" width="768" height="536" />
						</td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>
