<%@page import="Project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%
String roll1 = request.getParameter("roll1");
try 
{
    Connection con = ConnectionProvider.getCon();

    PreparedStatement ps = con.prepareStatement("DELETE from student where rollNo=?");
    ps.setString(1,roll1);
    ps.executeUpdate();
    response.sendRedirect("adminHome.jsp?roll1=deleted");
}
catch(Exception ex)
{
    System.out.print(ex);
        response.sendRedirect("adminHome.jsp?roll1=invalid");
}
%>