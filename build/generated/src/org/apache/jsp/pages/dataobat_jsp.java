package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import function.*;
import java.util.*;

public final class dataobat_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/header.jsp", out, false);
      out.write("\r\n");
      out.write("    <title>Data Obat || Apotek Siaga</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../public/assets/vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"../public/assets/vendor/fonts/circular-std/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../public/assets/libs/css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/vendor/datatables/css/dataTables.bootstrap4.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/vendor/datatables/css/buttons.bootstrap4.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/vendor/datatables/css/select.bootstrap4.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/vendor/datatables/css/fixedHeader.bootstrap4.css\">\r\n");
      out.write("                \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container-fluid dashboard-content\">\r\n");
      out.write("            ");
 
                String msg = request.getParameter("msg");
                String update = request.getParameter("upt");
                if(msg!=null){ 
      out.write("                \r\n");
      out.write("                <div class='alert alert-success' role='alert'>Data Obat berhasil Ditambahkan.</div>\r\n");
      out.write("            ");
 } if(update!=null){ 
      out.write("                \r\n");
      out.write("                <div class='alert alert-success' role='alert'>Data Obat berhasil Diperbarui.</div>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                <!-- pageheader -->\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\r\n");
      out.write("                        <div class=\"page-header\">\r\n");
      out.write("                            <h2 class=\"pageheader-title\">Data Obat</h2>                            \r\n");
      out.write("                            <div class=\"page-breadcrumb\">\r\n");
      out.write("                                <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                                    <ol class=\"breadcrumb\">\r\n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"..index.jsp\" class=\"breadcrumb-link\">Dashboard</a></li>\r\n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"#\" class=\"breadcrumb-link\">Data</a></li>\r\n");
      out.write("                                        <li class=\"breadcrumb-item active\" aria-current=\"page\">Data Obat</li>\r\n");
      out.write("                                    </ol>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                <!-- end pageheader -->\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                    <!-- ============================================================== -->\r\n");
      out.write("                    <!-- basic table  -->\r\n");
      out.write("                    <!-- ============================================================== -->\r\n");
      out.write("                    <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\r\n");
      out.write("                        <div class=\"card\">                           \r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"table-responsive\">\r\n");
      out.write("                                    <table class=\"table table-striped table-bordered first\" id=\"datatable\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>KODE</th>\r\n");
      out.write("                                                <th>NAMA OBAT</th>\r\n");
      out.write("                                                <th>JENIS</th>\r\n");
      out.write("                                                <th>KETERANGAN</th>\r\n");
      out.write("                                                <th>DOSIS</th>                                                \r\n");
      out.write("                                                <th>STOK</th>\r\n");
      out.write("                                                <th>HARGA</th>\r\n");
      out.write("                                                <th><center>AKSI</center></th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>                                            \r\n");
      out.write("                                                ");
    
                                                    List<fobat> data = obat.getAllRecords();                                                    
                                                    for (int x = 0; x < data.size(); x++) {
                                                
      out.write("\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getKd_obat());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getNama_obat());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getId_jenis());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getKeterangan());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getDosis());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getStok());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getHarga());
      out.write("</td>\r\n");
      out.write("                                                    <td align=\"center\"><a href=\"form-update-obat.jsp?kd_obat=");
      out.print(data.get(x).getKd_obat());
      out.write("\">\r\n");
      out.write("                                                       <button class=\"btn btn-dark\">Edit</button></a>\r\n");
      out.write("                                                        <a href=\"delete-obat.jsp?kd_obat=");
      out.print(data.get(x).getKd_obat());
      out.write("\" onclick=\"return confirm('Data akan di Hapus?')\">\r\n");
      out.write("                                                       <button class=\"btn btn-danger\">Hapus</button></a></td>                                                    \r\n");
      out.write("                                            </tr>");
 } 
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                        <div style=\"margin-bottom: 20px;\">                                             \r\n");
      out.write("                                            <a href=\"form-add-obat.jsp\"><button class=\"btn btn-primary\">\r\n");
      out.write("                                                    Add Obat</button></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- ============================================================== -->\r\n");
      out.write("                    <!-- end basic table  -->\r\n");
      out.write("                    <!-- ============================================================== -->                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>    \r\n");
      out.write("        <!-- Optional JavaScript -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/footer.jsp", out, false);
      out.write("\r\n");
      out.write("    <script src=\"../public/assets/vendor/jquery/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"../public/assets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\r\n");
      out.write("    <script src=\"../public/assets/vendor/slimscroll/jquery.slimscroll.js\"></script>\r\n");
      out.write("    <script src=\"../public/assets/vendor/multi-select/js/jquery.multi-select.js\"></script>\r\n");
      out.write("    <script src=\"../public/assets/libs/js/main-js.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src=\"../public/assets/vendor/datatables/js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js\"></script>\r\n");
      out.write("    <script src=\"../public/assets/vendor/datatables/js/buttons.bootstrap4.min.js\"></script>\r\n");
      out.write("    <script src=\"../public/assets/vendor/datatables/js/data-table.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/buttons/1.5.2/js/buttons.colVis.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/rowgroup/1.0.4/js/dataTables.rowGroup.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/select/1.2.7/js/dataTables.select.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/fixedheader/3.1.5/js/dataTables.fixedHeader.min.js\"></script>\r\n");
      out.write("\r\n");
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
