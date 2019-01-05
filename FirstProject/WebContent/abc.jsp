<%
 String msg1=(String)request.getAttribute("msg");
 if(msg1!=null){
%>
<font color="red">
<%
  out.println(msg1);
%>
</font>
<%
  }
%>

<form action="log" method="post">
<font color="blue">
User name : <input type="text" name="uname" /><br><br>
Password : <input type="password" name="pword" /><br><br>
</font>
<input type="submit" value="Click Here">

</form>

copyright &trade; &copy;