<%@page import="Project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%
    String course = request.getParameter("course");
    String branch = request.getParameter("branch");
    String rollNo = request.getParameter("rollNo");
    String name = request.getParameter("name");
    String fatherName = request.getParameter("fatherName");
    String gender = request.getParameter("gender");
    
try
{
    Connection con = ConnectionProvider.getCon();
    PreparedStatement ps = con.prepareStatement("UPDATE student SET course=?,branch=?,name=?,fatherName=?,gender=? where rollNo=?");
    ps.setString(1,course);
    ps.setString(2,branch);
    ps.setString(3,name);
    ps.setString(4,fatherName);
    ps.setString(5,gender);
    ps.setString(6,rollNo);
    ps.executeUpdate();
    response.sendRedirect("adminHome.jsp?roll1=valid");
}
catch(Exception e)
{
    System.out.print(e);
    response.sendRedirect("adminHome.jsp?roll1=invalid");
}
%>