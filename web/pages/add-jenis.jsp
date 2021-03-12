<%@page import="function.jenis_obat"%>
<jsp:useBean id="u" scope="page" class="function.fjenis_obat"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%@include file="form-jenis-obat.jsp" %>

<%
    int i=jenis_obat.save(u);
    if(i>0){                        
%>
        <script>   
            Swal.fire({
                type: 'success',
                title: 'Berhasil!',
                text: 'Data berhasil ditambahkan.',
                confirmButtonText: "OK"
            }).then(function() {
                window.location = "data-jenis-obat.jsp";
            });
        </script>
<%
    } else {               
        out.print("<script>alert('Data gagal Ditambahkan!'); history.go(-1);</script>");
    }
%> 