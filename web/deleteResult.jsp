<%@page import="Project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%
String roll2 = request.getParameter("roll2");
try 
{
    Connection con = ConnectionProvider.getCon();
    Statement st = con.createStatement();

    PreparedStatement ps = con.prepareStatement("DELETE from result where rollNo=?");
    ps.setString(1,roll2);
    ps.executeUpdate();
    response.sendRedirect("adminHome.jsp?roll2=deleted");
}
catch(Exception ex)
{
    System.out.print(ex);
        response.sendRedirect("adminHome.jsp?roll2=invalid");
}
%>