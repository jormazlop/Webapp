<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="org.omg.CORBA.PUBLIC_MEMBER"%>
<%
		String username=getServletContext().getInitParameter("Username");
		String password=getServletContext().getInitParameter("Password");
		
if(request.getParameter("username").equalsIgnoreCase(username)&& request.getParameter("userpass").equalsIgnoreCase(password))
{
session.setAttribute("islogin","plz sign in first");
%>
<jsp:forward page="ahome.jsp"></jsp:forward>
<% 
}

else{
request.setAttribute("Error","Lo siento! Usuario o contraseña incorrectos.");
session.setAttribute("Loginmsg","Identificate primero");
%>
<jsp:forward page="admin.jsp"></jsp:forward>
<% 
}
%>

