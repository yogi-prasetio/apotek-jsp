package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import function.*;
import java.sql.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("    <title>Penjualan</title>\n");
      out.write("    \n");

 Connection con=koneksi.getKoneksi();
 String qty = request.getParameter("qty");
 if(qty!=null) {
        out.print(request.getParameter("qty"));
        String id = request.getParameter("id_menu");
        String query = "SELECT kd_obat,harga FROM obat WHERE harga = '"+id+"'";
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(query);
        int updateQuery=0;
        if(rs.next()){
            String id_p = rs.getString("kd_obat");
            String nota = rs.getString("nota");
            int jumlah = Integer.valueOf(request.getParameter("qty"));
            String tanggalpesanan = request.getParameter("waktu");
            PreparedStatement pst = con.prepareStatement("INSERT INTO penjualan VALUES (?,?,?,?)");
            pst.setString(1, nota);
            pst.setString(2, id_p);
            pst.setInt(3, jumlah);            
            pst.setString(4, tanggalpesanan);
            updateQuery=pst.executeUpdate();
            if(updateQuery!=0)
            {
                
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                alert('Data Berhasil Ditambahkan!');\n");
      out.write("                     \n");
      out.write("            </script>\n");
      out.write("                ");

            }
            else{
            
      out.write("\n");
      out.write("            <script>\n");
      out.write("                \n");
      out.write("                alert('Data Gagal Ditambahkan');\n");
      out.write("                     \n");
      out.write("            </script>\n");
      out.write("            ");

            }
        }        
        }              

      out.write('\n');
      out.write('\n');
  
    Statement stm;
    ResultSet rs;
    Class.forName("com.mysql.jdbc.Driver");
    String query = "SELECT * FROM obat";
    stm = con.createStatement();
    rs = stm.executeQuery(query);

      out.write("\n");
      out.write("<form name=\"penjualan\" method=\"POST\" >\n");
      out.write("    Nota : <input type=\"text\" name=\"nota\"><br>\n");
      out.write("    Nama Obat : <select id=\"inputh\" class=\"custom-select\" name=\"id_menu\" onchange=\"proses()\" required>\n");
      out.write("                    <option hidden>Pilih Obat</option>\n");
      out.write("                        ");

                        while(rs.next()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getInt("harga"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("nama_obat"));
      out.write("</option>\n");
      out.write("                        ");

                        }
                        
      out.write("\n");
      out.write("                </select>\n");
      out.write("    Harga : <input type=\"text\" name=\"harga\" id=\"harga\"><br>\n");
      out.write("    Jumlah : <input type=\"text\" name=\"qty\"><br>    \n");
      out.write("    Waktu : <input type=\"text\" name=\"waktu\" value=\"");
      out.print(new java.util.Date());
      out.write("\"><br>    \n");
      out.write("    <input type=\"submit\" value=\"Simpan\">\n");
      out.write("</form>\n");
      out.write("    \n");
      out.write("<script>\n");
      out.write("    function proses(){\n");
      out.write("        var a = document.getElementById(\"inputh\").value;\n");
      out.write("                document.getElementById(\"harga\").value=a;\n");
      out.write("    }\n");
      out.write("    function prosesj(){\n");
      out.write("        var b = document.getElementById(\"inputj\").value;\n");
      out.write("        var a = document.getElementById(\"inputh\").value;\n");
      out.write("                document.getElementById(\"outj\").value=b*a;\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
