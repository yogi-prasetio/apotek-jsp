<%@page import="function.obat"%>
<jsp:useBean id="u" scope="page" class="function.fobat"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%@include file="dataobat.jsp" %>
<%
    int i=obat.delete(u);
    if(i>0){ %>
        <script>   
            Swal.fire({
                type: 'success',
                title: 'Berhasil!',
                text: 'Data telah dihapus.',                
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
                text: 'Maaf, data gagal dihapus karena sudah tersimpan di tabel Penjualan.',                
                confirmButtonText: "OK"
            }).then(function() {
                window.location = "dataobat.jsp";
            });
        </script>
<%  } %>
   
