<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>项目管理系统 </title>
<spring:url var="styleUrl" value="/resources/css/style.css" />
<link rel="stylesheet" rev="stylesheet" href="${styleUrl}" type="text/css" media="all" />
<style type="text/css">
<!--
.atten {
	font-size: 12px;
	font-weight: normal;
	color: #F00;
}
-->
</style>
</head>

<body class="ContentBody">
	<form action="" method="post" name="fom" id="fom" target="sypost">
		<div class="MainDiv">
			<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
				<tr>
					<th class="tablestyle_title">任务添加页面</th>
				</tr>
				<tr>
					<td class="CPanel">
						<table border="0" cellpadding="0" cellspacing="0" style="width: 100%">
							<tr>
								<td align="left">
									<input type="button" name="Submit" value="保存" class="button"/>
									<input type="button" name="Submit2" value="返回"" class="button"/>
								</td>
							</tr>
							<tr>
								<td width="100%">
									<fieldset style="height: 100%;">
										<legend>添加任务</legend>
										<table border="0" cellpadding="2" cellspacing="1" style="width: 100%">
											<tr>
												<td nowrap align="right" width="13%">任务标题:</td>
												<td width="41%">
													<input name="text" class="text" style="width: 250px" type="text" size="40" />
													<span class="red"> *</span>
												</td>
												<td align="right" width="19%">工期:</td>
												<td width="27%">
													<input name="Input22" id="Input22" class="text" style="width: 154px;" />
												</td>
											</tr>
											<tr>
												<td nowrap align="right">计划开始时间:</td>
												<td>
													<input name="" id="" class="text" style="width: 154px" />
												</td>
												<td align="right">计划结束时间:</td>
												<td>
													<input name="Input" id="Input" class="text" style="width: 154px" />
												</td>
											</tr>
											<tr>
												<td nowrap align="right">任务执行人:</td>
												<td>
													<select name="select2">
														<option selected="selected">==请选择==</option>
														<option>暂不</option>
														<option>一般</option>
														<option>需要</option>
														<option>急</option>
														<option>很急</option>
													</select>
												</td>
												<td align="right">优先级:</td>
												<td>
													<select name="select">
														<option selected="selected">==请选择==</option>
														<option>暂不</option>
														<option>一般</option>
														<option>需要</option>
														<option>急</option>
														<option>很急</option>
													</select>
												</td>
											</tr>
											<tr>
												<td nowrap align="right" height="120px">任务说明:</td>
												<td colspan="3">
													<textarea id="textarea" name="textarea" rows="5" cols="80"></textarea>
												</td>
											</tr>
										</table>
										<br/>
									</fieldset>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center" height="50px">
						<input type="button" name="Submit" value="保存" class="button"/>
						<input type="button" name="Submit2" value="返回" class="button"/>
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>
