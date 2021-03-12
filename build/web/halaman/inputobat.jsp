<%@page import="function.obat"%>
<jsp:useBean id="u" class="function.fobat"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
    <%
    int i=obat.save(u);
    if(i>0){
        out.print("<div class='valid-feedback'><b>Data Obat Berhasil ditambahkan ! </b><div>");
    }else{
        out.print("<div class='invalid-feedback'><b>Data Obat Gagal ditambahkan ! </b><div>");
    }
    %>
<jsp:include page="index.jsp?dir=pages&file=finputobat.jsp"></jsp:include>
