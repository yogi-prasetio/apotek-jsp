<%@page import="function.*"%>
<jsp:useBean id="u" scope="page" class="function.fjenis_obat"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
    int i=jenis_obat.delete(u);
    if(i>0){
        response.sendRedirect("data-jenis-obat.jsp");
    } else {
        out.print("<script>alert('Data gagal Dihapus!')</script>");    
%>      <meta http-equiv="REFRESH" content="0; data-jenis-obat.jsp">
<%  } %>
   
