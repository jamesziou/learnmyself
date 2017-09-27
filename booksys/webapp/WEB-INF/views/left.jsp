<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>项目管理系统</title>
<spring:url var="ico02Images" value="/resources/images/ico02.gif" />
<spring:url var="ico03Images" value="/resources/images/ico03.gif" />
<spring:url var="ico04Images" value="/resources/images/ico04.gif" />
<spring:url var="ico05Images" value="/resources/images/ico05.gif" />
<spring:url var="ico06Images" value="/resources/images/ico06.gif" />
<spring:url var="leftImages" value="/resources/images/left.gif" />
<spring:url var="nav01Images" value="/resources/images/nav01.gif" />
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(${leftImages});
}
</style>
<spring:url var="cssUrl" value="/resources/css/css.css" />
<link href="${cssUrl}" rel="stylesheet" type="text/css" />
</head>
<script language=JavaScript>
	function tupian(idt) {
		var nametu = "xiaotu" + idt;
		var tp = document.getElementById(nametu);
		tp.src = "${ico05Images}"; //图片ico04为白色的正方形

		for ( var i = 1; i < 30; i++) {

			if (i != idt * 1) {
				var tp2 = document.getElementById('xiaotu' + i);
				if (tp2 != undefined) {
					tp2.src = "${ico06Images}";
				}//图片ico06为蓝色的正方形
			}
		}
	}

	function list(idstr) {
		var name1 = "subtree" + idstr;
		var name2 = "img" + idstr;
		var objectobj = document.all(name1);
		var imgobj = document.all(name2);

		if (objectobj.style.display == "none") {
			for (var i = 1; i < 10; i++) {
				var name3 = "img" + i;
				var name = "subtree" + i;
				var o = document.all(name);
				if (o != undefined) {
					o.style.display = "none";
					var image = document.all(name3);
					image.src = "${ico04Images}";
				}
			}
			objectobj.style.display = "";
			imgobj.src = "${ico03Images}";
		} else {
			objectobj.style.display = "none";
			imgobj.src = "${ico04Images}";
		}
	}
</script>

<body>
	<table width="198" border="0" cellpadding="0" cellspacing="0"
		class="left-table01">
		<tr>
			<td>
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="207" height="55" background="${nav01Images}">
							<table width="90%" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="25%" rowspan="2">
										<img src="${ico02Images}" width="35" height="35" />
									</td>
									<td width="75%" height="22" class="left-font01">
										您好，<span class="left-font02">aaaaaaa</span>
									</td>
								</tr>
								<tr>
									<td height="22" class="left-font01">
										[&nbsp;<a href="javascript:void(0);" target="_top" class="left-font01">退出</a>&nbsp;]
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!--  任务系统开始    -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					class="left-table03">
					<tr>
						<td height="29">
							<table width="85%" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="8%">
										<img name="img8" id="img8" src="${ico04Images}" width="8" height="11" />
									</td>
									<td width="92%">
										<a href="javascript:void(0);" target="mainFrame" class="left-font03" onClick="list('8');">任务管理</a>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table id="subtree8" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
					<tr>
						<td width="9%" height="20">
							<img id="xiaotu20" src="${ico06Images}" width="8" height="12" />
						</td>
						<td width="91%">
							<spring:url var="addTask" value="/task/addTask"></spring:url>
							<a href="${addTask}" target="mainFrame" class="left-font03" onClick="tupian('20');">创建任务</a>
						</td>
					</tr>
					<tr>
						<td width="9%" height="21">
							<img id="xiaotu21" src="${ico06Images}" width="8" height="12" />
						</td>
						<td width="91%">
							<a href="listrenwu.htm" target="mainFrame" class="left-font03" onClick="tupian('21');">任务信息查看</a>
						</td>
					</tr>
				</table>
				<!--  任务系统结束    -->

				<!--个人信息管理开始-->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
					<tr>
						<td height="29">
							<table width="85%" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="8%">
										<img name="img9" id="img9" src="${ico04Images}" width="8" height="11" /></td>
									<td width="92%">
										<a href="javascript:void(0);" target="mainFrame" class="left-font03" onClick="list('9');">个人管理</a>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table id="subtree9" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
					<tr>
						<td width="9%" height="22">
							<img id="xiaotu22" src="${ico06Images}" width="8" height="12"/>
						</td>
						<td width="91%">
							<a href="listgerenxinxi.htm" target="mainFrame" class="left-font03" onClick="tupian('22');">个人信息查看</a>
						</td>
					</tr>
					<tr>
						<td width="9%" height="23">
							<img id="xiaotu23" src="${ico06Images}" width="8" height="12"/>
						</td>
						<td width="91%">
							<a href="listgerenrenwu.htm" target="mainFrame" class="left-font03" onClick="tupian('23');">任务信息查看</a>
						</td>
					</tr>
				</table>
				<!--  个人信息结束    -->
			</td>
		</tr>
	</table>
</body>
</html>
