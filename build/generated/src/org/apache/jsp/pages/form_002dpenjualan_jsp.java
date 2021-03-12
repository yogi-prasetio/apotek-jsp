package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Date;
import function.*;
import java.sql.*;
import function.*;
import java.util.*;

public final class form_002dpenjualan_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
    
    Connection con=koneksi.getKoneksi();
    String nota="";
    ResultSet rs=con.createStatement().executeQuery("SELECT MAX(right(nota,5)) AS nota FROM penjualan");    
    while(rs.next()){
        if(rs.first()==false){
            nota="TRS-00001";
        } else {
            rs.last();
            int auto_id = rs.getInt(1)+1;
            String no = String.valueOf(auto_id);
            int noLong = no.length();
            for (int x=0; x<=4-noLong; x++){
                no ="0"+no;
            }
            nota=("TRS-"+no);
        }
    }
    rs.close();
    
    if(request.getParameter("qty")!=null) {
        String kd = request.getParameter("kd_obat");
        String query = "SELECT kd_obat,harga FROM obat WHERE harga = '"+kd+"'";
        Statement stm = con.createStatement();
        ResultSet r = stm.executeQuery(query);
        int status=0;
        if(r.next()){
            String id_p = r.getString("kd_obat");            
            int jumlah = Integer.valueOf(request.getParameter("qty"));
            int total = Integer.valueOf(request.getParameter("total"));
            String waktu = request.getParameter("waktu");
            PreparedStatement pst = con.prepareStatement("INSERT INTO penjualan VALUES (?,?,?,?,?)");
            pst.setString(1, nota);
            pst.setString(2, id_p);
            pst.setInt(3, jumlah);
            pst.setInt(4, total);
            pst.setString(5, waktu);
            status=pst.executeUpdate();
            if(status>0) {
                out.print("berhasil ditambahkan");
            } else{
                out.print("gagal ditambahkan");
            }
        }        
        }              

      out.write('\n');
      out.write('\n');
  
    Statement stm;
    ResultSet res;
    String query = "SELECT * FROM obat";
    stm = con.createStatement();
    res = stm.executeQuery(query);

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Form Penjualan || Apotek Siaga</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../public/assets/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"../public/assets/vendor/fonts/circular-std/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../public/assets/libs/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/header.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("            <div class=\"container-fluid  dashboard-content\">\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- pageheader -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\n");
      out.write("                        <div class=\"page-header\">\n");
      out.write("                            <h2 class=\"pageheader-title\">Form Penjualan </h2>                            \n");
      out.write("                            <div class=\"page-breadcrumb\">\n");
      out.write("                                <nav aria-label=\"breadcrumb\">\n");
      out.write("                                    <ol class=\"breadcrumb\">\n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"../index.jsp\" class=\"breadcrumb-link\">Dashboard</a></li>                                        \n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"#\" class=\"breadcrumb-link\">Forms</a></li>\n");
      out.write("                                        <li class=\"breadcrumb-item active\" aria-current=\"page\">Form Penjualan</li>\n");
      out.write("                                    </ol>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- end pageheader -->\n");
      out.write("                <!-- ============================================================== -->                \n");
      out.write("                \n");
      out.write("                    <div class=\"row\" style=\"width: 60%;\">\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                        <!-- validation form -->\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                        <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <form class=\"needs-validation\" name=\"transaksi\" method=\"POST\" validate>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom01\">Nota Penjualan</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"nota\" id=\"validationCustom01\" value=\"");
 out.print(nota);
      out.write("\" readonly required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>                                            \n");
      out.write("                                        </div>              \n");
      out.write("                                        <div class=\"form-row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom04\">Nama Obat</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <select id=\"kode\" class=\"custom-select\" name=\"kd_obat\" onchange=\"proses()\" required>\n");
      out.write("                                                    <option>--- Pilih Obat ---</option>\n");
      out.write("                                                    ");
 while(res.next()) { 
      out.write("\n");
      out.write("                                                        <option value=\"");
      out.print(res.getInt("harga"));
      out.write('"');
      out.write('>');
      out.print(res.getString("nama_obat"));
      out.write("</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-row\">        \n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom05\">Harga</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"number\" class=\"form-control\" name=\"harga\" id=\"harga\" readonly>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div> \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-row\">        \n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom05\">Jumlah</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"number\" class=\"form-control\" name=\"qty\" id=\"qty\" placeholder=\"Qty\" onkeyup=\"hitung()\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div> \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-row\">        \n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom05\">Jumlah</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"number\" class=\"form-control\" name=\"total\" id=\"total\" placeholder=\"Total Harga\" readonly required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div> \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom01\">Waktu </label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"waktu\" id=\"waktu\" readonly required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-12 pl-0\">\n");
      out.write("                                                <p class=\"text-right\">                                                \n");
      out.write("                                                    <input class=\"btn btn-primary\" name=\"submit\" type=\"submit\" value=\"SAVE\">\n");
      out.write("                                                    <button class=\"btn btn-secondary\" type=\"reset\">CANCEL</button>\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                        <!-- end validation form -->\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/footer.jsp", out, false);
      out.write("\n");
      out.write("<script>\n");
      out.write("    function proses(){\n");
      out.write("        var a = document.getElementById(\"kode\").value;\n");
      out.write("                document.getElementById(\"harga\").value=a;\n");
      out.write("        date = new Date();\n");
      out.write("        var detik = String(date.getSeconds()+ 1).padStart(2,'0');\n");
      out.write("        var menit = String(date.getMinutes()+ 1).padStart(2,'0');\n");
      out.write("        var jam = String(date.getHours());\n");
      out.write("        var tanggal = String(date.getDate());\n");
      out.write("        var bulan = String(date.getMonth()+ 1).padStart(2,'0');\n");
      out.write("        var tahun = String(date.getFullYear());\n");
      out.write("                \n");
      out.write("        today = tahun+\"-\"+bulan+\"-\"+tanggal+\" \"+jam+\":\"+menit+\":\"+detik;\n");
      out.write("                document.getElementById(\"waktu\").value=today;\n");
      out.write("    }\n");
      out.write("    function hitung(){\n");
      out.write("        var b = document.getElementById(\"harga\").value;\n");
      out.write("        var a = document.getElementById(\"qty\").value;\n");
      out.write("                document.getElementById(\"total\").value=a*b;\n");
      out.write("    }\n");
      out.write("</script>        \n");
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
