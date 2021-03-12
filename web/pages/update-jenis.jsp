<%@page import="function.jenis_obat"%>
<jsp:useBean id="u" scope="page" class="function.fjenis_obat"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%@include file="form-update-jenis.jsp" %>

<%
    int i=jenis_obat.update(u);
    if(i>0){                        
%>
        <script>   
            Swal.fire({
                type: 'success',
                title: 'Berhasil!',
                text: 'Data berhasil diperbarui.',
                confirmButtonText: "OK"
            }).then(function() {
                window.location = "data-jenis-obat.jsp";
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