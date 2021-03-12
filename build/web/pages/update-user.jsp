<%@page import="function.*"%>
<jsp:useBean id="u" scope="page" class="function.fuser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%@include file="form-update-user.jsp" %>

<%
    int i=user.update(u);
    if(i>0){
%>
        <script>   
            Swal.fire({
                type: 'success',
                title: 'Berhasil!',
                text: 'Data berhasil diperbarui.',
                confirmButtonText: "OK"
            }).then(function() {
                window.location = "datauser.jsp";
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