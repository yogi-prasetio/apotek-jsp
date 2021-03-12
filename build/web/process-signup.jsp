<%@page import="function.user"%>
<jsp:useBean id="u" scope="page" class="function.fuser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%@include file="sign-up.jsp" %>
<%    
    int i=user.save(u);
    if(i>0){        
%>            
        <script>   
            Swal.fire({
                type: 'success',
                title: 'Daftar Berhasil!',
                text: 'Terimakasih',                
                confirmButtonText: "OK"
            }).then(function() {
                window.location = "login.jsp";
            });
        </script>
<%  } else { %>
        <jsp:forward page="sign-up.jsp">
        <jsp:param name="data" value="Daftar Gagal!"></jsp:param>
        <jsp:param name="msg" value="silahkan periksa data kembali"></jsp:param>
        </jsp:forward>
<%  } %>