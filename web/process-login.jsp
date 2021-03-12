<%@page import="java.sql.*"%>
<%@page import="function.*"%>
<%    
    Connection con=koneksi.getKoneksi();
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    ResultSet rs=con.createStatement().executeQuery("SELECT * FROM `user` WHERE "
                + "username ='"+username+"' AND password ='"+password+"'");    
    boolean valid=rs.next();    
    
    if (valid) {
        out.println("Your successfully logged in");
        session.setAttribute("session", "TRUE");
        session.setAttribute("namauser", rs.getString("nama"));        
        session.setAttribute("waktu", new java.util.Date());
        response.sendRedirect("dashboard.jsp");
    } else {
%>
        <jsp:forward page="login.jsp">
        <jsp:param name="data" value="Sorry, username or password wrong!"></jsp:param>
        </jsp:forward>
<%  } %>