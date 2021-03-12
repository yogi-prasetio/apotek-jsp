<%@page import="function.user"%>
<jsp:useBean id="u" scope="page" class="function.fuser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%@include file="form-add-user.jsp" %>

<%
    int i=user.save(u);
    if(i>0){
%>
        <script>   
            Swal.fire({
                type: 'success',
                title: 'Berhasil!',
                text: 'Data berhasil ditambahkan.',
                confirmButtonText: "OK"
            }).then(function() {
                window.location = "datauser.jsp";
            });
        </script>
<%
    } else {               
        out.print("<script>alert('Data gagal Ditambahkan!'); history.go(-1);</script>");
    }
%> 