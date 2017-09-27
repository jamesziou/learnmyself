<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>项目管理系统</title>
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
</style>
<spring:url var="cssUrl" value="/resources/css/css.css" />
<link href="${cssUrl}" rel="stylesheet" type="text/css" />
</head>

<body>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<spring:url var="top02Images" value="/resources/images/top02.gif" />
		<spring:url var="top03Images" value="/resources/images/top03.gif" />
		<spring:url var="ioc13Images" value="/resources/images/ico13.gif" />
		<spring:url var="line01Images" value="/resources/images/line01.gif" />
		<tr>
			<td height="147" background = "${top02Images}">
				<img src="${top03Images}" width="776" height="147" /></td>
		</tr>
	</table>
	<table width="562" border="0" align="center" cellpadding="0" cellspacing="0" class="right-table03">
		<tr>
			<td width="221"><table width="95%" border="0" cellpadding="0" cellspacing="0" class="login-text01">
					<tr>
						<td>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="login-text01">
								<tr>
									<td align="center"><img src="${ioc13Images}" width="107" height="97" /></td>
								</tr>
								<tr>
									<td height="40" align="center">&nbsp;</td>
								</tr>
							</table>
						</td>
						<td><img src="${line01Images}" width="5" height="292" /></td>
					</tr>
				</table>
			</td>
			<spring:url var ="loginUrl" value="/user/login"/>
			<form action="${loginUrl}" method="post">
				<td>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="31%" height="35" class="login-text02">用户名称：<br /></td>
							<td width="69%">
								<input type="text" size="15" maxlength="10" name="username"/>
							</td>
						</tr>
						<tr>
							<td height="35" class="login-text02">密 码：<br /></td>
							<td><input type="password" size="16" maxlength="10" name="password"/></td>
						</tr>
						<tr>
							<td height="35">&nbsp;</td>
							<td>
								<input name="submit" type="submit" class="right-button01" value="确认登陆" />
								<input name="reset" type="reset" class="right-button01"value="重置" />
							</td>
						</tr>
					</table>
				</td>
			</form>
		</tr>
	</table>
</body>
</html>