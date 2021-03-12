<%@page import="function.obat"%>
<jsp:useBean id="u" scope="page" class="function.fobat"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%@include file="form-add-obat.jsp" %>

<%
    int i=obat.save(u);
    if(i>0){                        
%>
        <script>   
            Swal.fire({
                type: 'success',
                title: 'Berhasil!',
                text: 'Data berhasil ditambahkan.',
                confirmButtonText: "OK"
            }).then(function() {
                window.location = "dataobat.jsp";
            });
        </script>
<%
    } else {               
        out.print("<script>alert('Data gagal Ditambahkan!'); history.go(-1);</script>");
    }
%> 