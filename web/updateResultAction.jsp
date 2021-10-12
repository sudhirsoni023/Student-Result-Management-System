<%@page import="Project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%
    String rollNo = request.getParameter("rollNo");
    String subject1 = request.getParameter("subject1");
    String subject2 = request.getParameter("subject2");
    String subject3 = request.getParameter("subject3");
    String subject4 = request.getParameter("subject4");
    String subject5 = request.getParameter("subject5");
    String subject6 = request.getParameter("subject6");
    String subject7 = request.getParameter("subject7");
    
try
{
    Connection con = ConnectionProvider.getCon();
    PreparedStatement ps = con.prepareStatement("UPDATE result SET subject1=?,subject2=?,subject3=?,subject4=?,subject5=?,subject6=?,subject7=? where rollNo=?");
    ps.setString(1, subject1);
    ps.setString(2, subject2);
    ps.setString(3, subject3);
    ps.setString(4, subject4);
    ps.setString(5, subject5);
    ps.setString(6, subject6);
    ps.setString(7, subject7);
    ps.setString(8,rollNo);
    ps.executeUpdate();
    response.sendRedirect("adminHome.jsp?roll2=valid");
    
}
catch(Exception e)
{
    System.out.print(e);
    response.sendRedirect("adminHome.jsp?roll2=invalid");
}
%>