<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>项目管理系统</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>
<spring:url var="cssUrl" value="/resources/css/css.css" />
<link href="${cssUrl}" rel="stylesheet" type="text/css" />
</head>

<body>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<spring:url var="topImages" value="/resources/images/top.gif" />
			<spring:url var="logoImages" value="/resources/images/logo.gif" />
			<td height="59" background="${topImages}">
				<table width="99%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="1%">
							<img src="${logoImages}" width="557" height="59" border="0" />
						</td>
						<td width="64%" align="right" style="font-size: 12px; vertical-align: bottom;"></td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>
