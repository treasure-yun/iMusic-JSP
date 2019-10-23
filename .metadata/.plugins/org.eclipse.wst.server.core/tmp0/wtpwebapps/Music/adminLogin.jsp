<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理系统</title>
<script type="text/javascript">
function checkForm(form){
	if(form.username.value==""){
		alert("用户名不能为空！");
		form.username.focus();
		return false;
	}
	if(form.password.value==""){
		alert("密码不能为空！");
		form.password.focus();
		return false;
	}
	return true;
}
</script>
</head>
<body>
<table width="1250" height="50" border="0" style="background:#404040">
   <tr>
      <td width="100"></td>
      <td width="150" align="center">
         <img src="picture/icon.png" height="50"/></td>
      <td width="200" align="center">
         <font size="5" color="white"><b>后台管理系统</b></font>
      </td>
      <td width="800"></td>
   </tr>
</table>
<hr width="400px" size="6" color="white">
<h2 align="center">管理员登录</h2>
<hr width="450px" size="3" color="red">
<hr width="450px" size="2" color="white">
<form name="form1" method="post" action="servlet/AdminLogin" onsubmit="return checkForm(this);">
   <table width="334" border="0" align="center">
   <tr>
      <td width="75" align="center">用&nbsp;户&nbsp;名:</td>
      <td width="259" align="center"><input type="text" name="username">*</td>
   </tr>
   <tr>
      <td align="center">密&nbsp;&nbsp;&nbsp;&nbsp;码:</td>
      <td align="center"><input type="password" name="password"/>*</td>
   </tr>
   <tr height="10px"></tr>
   <tr>
      <td colspan="2" align="center">
      <input type="submit" name="submit" value="登录"/>
      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" name="reset" value="重置"/></td>
   </tr>
   </table>
</form>
</body>
</html>