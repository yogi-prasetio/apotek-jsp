<%-- 
    Document   : form
    Created on : Dec 17, 2020, 10:32:09 PM
    Author     : Yogi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="obat" method="post" action="input.jsp">
            Kode : <input type="text" name="kd_obat"></br>
            Nama : <input type="text" name="nama_obat"></br>
            Jenis : <input type="text" name="jenis"></br>
            Keterangan : <input type="text" name="keterangan"></br>
            Stok : <input type="text" name="stok"></br>
            Harga : <input type="text" name="harga"></br>
            <input type="submit" name="submit">Simpan
        </form>
    </body>
</html>
