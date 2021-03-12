package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/pages/dashboard.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");

    String namauser=(String) session.getAttribute("namauser");
    if(namauser==null) { namauser="";

      out.write(' ');
      if (true) {
        _jspx_page_context.forward("login.jsp");
        return;
      }
      out.write('\n');
 } 
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write(" \n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/assets/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"public/assets/vendor/fonts/circular-std/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/assets/libs/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/assets/vendor/charts/chartist-bundle/chartist.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/assets/vendor/charts/morris-bundle/morris.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/assets/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/assets/vendor/charts/c3charts/c3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"public/assets/vendor/fonts/flag-icon-css/flag-icon.min.css\">\n");
      out.write("    <title>Dashboard || Apotek Siaga</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- main wrapper -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div class=\"dashboard-main-wrapper\">\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- navbar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div class=\"dashboard-header\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-white fixed-top\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Apotek Siaga</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto navbar-right-top\">\n");
      out.write("                        <li class=\"nav-item dropdown nav-user\">\n");
      out.write("                            <a class=\"nav-link nav-user-img\" href=\"#\" id=\"navbarDropdownMenuLink2\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><img src=\"public/assets/images/user.png\" alt=\"\" class=\"user-avatar-md rounded-circle\"></a>\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right nav-user-dropdown\" aria-labelledby=\"navbarDropdownMenuLink2\">\n");
      out.write("                                <div class=\"nav-user-info\">\n");
      out.write("                                    <h5 class=\"mb-0 text-white nav-user-name\">");
      out.print(namauser);
      out.write("</h5>\n");
      out.write("                                    <span class=\"status\"></span><span class=\"ml-2\">");
      out.print(session.getAttribute("waktu"));
      out.write("</span>\n");
      out.write("                                </div>                                \n");
      out.write("                                <a class=\"dropdown-item\" href=\"login.jsp\"><i class=\"fas fa-power-off mr-2\"></i>Logout</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- end navbar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- left sidebar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div class=\"nav-left-sidebar sidebar-dark\">\n");
      out.write("            <div class=\"menu-list\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                    <a class=\"d-xl-none d-lg-none\" href=\"index.jsp\">Dashboard</a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                        <ul class=\"navbar-nav flex-column\">\n");
      out.write("                            <li class=\"nav-divider\">\n");
      out.write("                                Menu\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item \">\n");
      out.write("                                <a class=\"nav-link active\" href=\"index.jsp\" aria-expanded=\"false\" data-target=\"#submenu-1\" aria-controls=\"submenu-1\"><i class=\"fa fa-fw fa-user-circle\"></i>Dashboard</a> \n");
      out.write("                            </li>                            \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"\" data-toggle=\"collapse\" aria-expanded=\"false\" data-target=\"#submenu-3\" aria-controls=\"submenu-3\"><i class=\"fas fa-fw fa-table\"></i>Data</a>\n");
      out.write("                                <div id=\"submenu-3\" class=\"collapse submenu\" style=\"\">\n");
      out.write("                                    <ul class=\"nav flex-column\">\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"pages/dataobat.jsp\">Data Obat</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"pages/datatransaksi.jsp\">Data Transaksi</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"pages/datauser.jsp\">Data User</a>\n");
      out.write("                                        </li>                                        \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item \">\n");
      out.write("                                <a class=\"nav-link\" href=\"\" data-toggle=\"collapse\" data-target=\"#submenu-4\" aria-controls=\"submenu-4\" aria-expanded=\"false\"><i class=\"fab fa-fw fa-wpforms\"></i>Forms </a>\n");
      out.write("                                <div id=\"submenu-4\" class=\"collapse submenu\" style=\"\">\n");
      out.write("                                    <ul class=\"nav flex-column\">\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"pages/form-add-obat.jsp\">Form Obat</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"pages/form-transaksi.jsp\">Form Transaksi</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"pages/form-add-user.jsp\">Form User</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\" aria-expanded=\"false\" ><i class=\"fas fa-fw fa-file\"></i>Laporan</a>                                \n");
      out.write("                            </li>                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- end left sidebar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- wrapper  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div class=\"dashboard-wrapper\">\n");
      out.write("\n");
      out.write("            ");
      out.write('H');
      out.write("\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- footer -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12\">\n");
      out.write("                             Copyright © 2020. Apotek Siaga by <a href=\"https://yogiprasetio5.blogspot.com/\">Yogi Prasetio</a>.\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12\">\n");
      out.write("                            <div class=\"text-md-right footer-links d-none d-sm-block\">\n");
      out.write("                                <a href=\"javascript: void(0);\">About</a>\n");
      out.write("                                <a href=\"javascript: void(0);\">Support</a>\n");
      out.write("                                <a href=\"javascript: void(0);\">Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- end footer -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- end wrapper  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("    </div>\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- end main wrapper  -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jquery 3.3.1 -->\n");
      out.write("    <script src=\"public/assets/vendor/jquery/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- bootstap bundle js -->\n");
      out.write("    <script src=\"public/assets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\n");
      out.write("    <!-- slimscroll js -->\n");
      out.write("    <script src=\"public/assets/vendor/slimscroll/jquery.slimscroll.js\"></script>\n");
      out.write("    <!-- main js -->\n");
      out.write("    <script src=\"public/assets/libs/js/main-js.js\"></script>\n");
      out.write("    <!-- chart chartist js -->\n");
      out.write("    <script src=\"public/assets/vendor/charts/chartist-bundle/chartist.min.js\"></script>\n");
      out.write("    <!-- sparkline js -->\n");
      out.write("    <script src=\"public/assets/vendor/charts/sparkline/jquery.sparkline.js\"></script>\n");
      out.write("    <!-- morris js -->\n");
      out.write("    <script src=\"public/assets/vendor/charts/morris-bundle/raphael.min.js\"></script>\n");
      out.write("    <script src=\"public/assets/vendor/charts/morris-bundle/morris.js\"></script>\n");
      out.write("    <!-- chart c3 js -->\n");
      out.write("    <script src=\"public/assets/vendor/charts/c3charts/c3.min.js\"></script>\n");
      out.write("    <script src=\"public/assets/vendor/charts/c3charts/d3-5.4.0.min.js\"></script>\n");
      out.write("    <script src=\"public/assets/vendor/charts/c3charts/C3chartjs.js\"></script>\n");
      out.write("    <script src=\"public/assets/libs/js/dashboard-ecommerce.js\"></script>\n");
      out.write("</body>\n");
      out.write(" \n");
      out.write("</html>");
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
