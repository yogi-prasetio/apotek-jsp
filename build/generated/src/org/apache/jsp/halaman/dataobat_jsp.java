package org.apache.jsp.halaman;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Data Obat</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../public/assets/vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"../public/assets/vendor/fonts/circular-std/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../public/assets/libs/css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/vendor/datatables/css/dataTables.bootstrap4.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/vendor/datatables/css/buttons.bootstrap4.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/vendor/datatables/css/select.bootstrap4.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../public/assets/vendor/datatables/css/fixedHeader.bootstrap4.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>        \r\n");
      out.write("            <div class=\"container-fluid  dashboard-content\">\r\n");
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
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"#\" class=\"breadcrumb-link\">Dashboard</a></li>\r\n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"#\" class=\"breadcrumb-link\">Data Obat</a></li>\r\n");
      out.write("                                        <li class=\"breadcrumb-item active\" aria-current=\"page\">All</li>\r\n");
      out.write("                                    </ol>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                <!-- end pageheader -->\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("        \r\n");
      out.write("                \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                    <!-- ============================================================== -->\r\n");
      out.write("                    <!-- basic table  -->\r\n");
      out.write("                    <!-- ============================================================== -->\r\n");
      out.write("                    <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <h5 class=\"card-header\">DATA OBAT</h5>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"table-responsive\">\r\n");
      out.write("                                    <table class=\"table table-striped table-bordered first\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>KODE</th>\r\n");
      out.write("                                                <th>NAMA OBAT</th>\r\n");
      out.write("                                                <th>JENIS</th>\r\n");
      out.write("                                                <th>KETERANGAN</th>\r\n");
      out.write("                                                <th>STOK</th>\r\n");
      out.write("                                                <th>HARGA</th>\r\n");
      out.write("                                                <th colspan=\"2\"><center>AKSI</center></th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>                                            \r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                ");

                                                    obat ob = new obat();
                                                    List<fobat> data = new ArrayList<fobat>();
                                                    String ket = request.getParameter("ket");
                                                    if (ket == null) {
                                                        data = ob.getAllRecords();
                                                    } 
                                                    for (int x = 0; x < data.size(); x++) {
                                                
      out.write("\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getKode());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getNama());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getJenis());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getKeterangan());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getStok());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(data.get(x).getHarga());
      out.write("</td>\r\n");
      out.write("                                                    <td><a href=\"#\">\r\n");
      out.write("                                                       <button class=\"btn btn-primary\">Edit</button></a></td>\r\n");
      out.write("                                                    <td><a href=\"#\">\r\n");
      out.write("                                                       <button class=\"btn btn-danger\">Hapus</button></a></td>                                                    \r\n");
      out.write("                                            </tr>");
}
      out.write("\r\n");
      out.write("                                            </c:forEach>                                            \r\n");
      out.write("                                        </tbody>                                        \r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- ============================================================== -->\r\n");
      out.write("                    <!-- end basic table  -->\r\n");
      out.write("                    <!-- ============================================================== -->                    \r\n");
      out.write("                </div>\r\n");
      out.write("            <script type=\"text/javascript\">                \r\n");
      out.write("                $(document).ready(function() {\r\n");
      out.write("                    $('.first').DataTable()({\r\n");
      out.write("                            \"scrollX\": false,\r\n");
      out.write("                            \"Processing\": true,\r\n");
      out.write("                            \"ServerSide\": true,\r\n");
      out.write("                            \"paging\":false,\r\n");
      out.write("                            \"order\":[2,'asc']\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("            </div>\r\n");
      out.write("        <!-- Optional JavaScript -->\r\n");
      out.write("    <script src=\"../../public/assets/vendor/jquery/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script ssrc=\"../../public/assets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\r\n");
      out.write("    <script src=\"../../public/assets/vendor/slimscroll/jquery.slimscroll.js\"></script>\r\n");
      out.write("    <script src=\"../../public/assets/vendor/multi-select/js/jquery.multi-select.js\"></script>\r\n");
      out.write("    <script src=\"../../public/assets/libs/js/main-js.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src=\"../../public/assets/vendor/datatables/js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js\"></script>\r\n");
      out.write("    <script src=\"../../public/assets/vendor/datatables/js/buttons.bootstrap4.min.js\"></script>\r\n");
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
      out.write("    \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
