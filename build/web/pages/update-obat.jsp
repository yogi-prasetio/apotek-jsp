<%@page import="function.obat"%>
<jsp:useBean id="u" scope="page" class="function.fobat"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%@include file="form-update-obat.jsp" %>

<%
    int i=obat.update(u);
    if(i>0){
%>
        <script>   
            Swal.fire({
                type: 'success',
                title: 'Berhasil!',
                text: 'Data berhasil diperbarui.',
                confirmButtonText: "OK"
            }).then(function() {
                window.location = "dataobat.jsp";
            });
        </script>
<%  } else { %>
        <script>   
            Swal.fire({
                type: 'error',
                title: 'Error!!',
                text: 'Maaf, data gagal diperbarui.',                
                confirmButtonText: "OK"
            }).then(function() {
                history.go(-1);
            });
        </script>
<%  } %>