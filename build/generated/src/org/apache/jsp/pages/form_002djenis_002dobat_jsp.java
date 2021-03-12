package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import function.*;
import java.util.*;
import function.jenis_obat;

public final class form_002djenis_002dobat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    \n");
      out.write("    <title>Form Input Jenis Obat || Apotek Siaga</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("            <div class=\"container-fluid  dashboard-content\">\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- pageheader -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\n");
      out.write("                        <div class=\"page-header\">                            \n");
      out.write("                            <h2 class=\"pageheader-title\">Form Input Jenis Obat</h2>\n");
      out.write("                            <div class=\"page-breadcrumb\">\n");
      out.write("                                <nav aria-label=\"breadcrumb\">\n");
      out.write("                                    <ol class=\"breadcrumb\">\n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"../index.jsp\" class=\"breadcrumb-link\">Dashboard</a></li>                                        \n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"\" class=\"breadcrumb-link\">Forms</a></li>\n");
      out.write("                                        <li class=\"breadcrumb-item active\" aria-current=\"page\">Input Jenis Obat</li>\n");
      out.write("                                    </ol>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- end pageheader -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("             \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                        <!-- validation form -->\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                        <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\n");
      out.write("                            <div class=\"card\">                                \n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <form class=\"needs-validation\" name=\"inputobat\" method=\"POST\" validate>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom01\">Id Jenis</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"id_jenis\" id=\"validationCustom01\" placeholder=\"Id\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>                                            \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom03\">Jenis Obat</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"jenis\" id=\"validationCustom03\" placeholder=\"Jenis Obat\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>                                        \n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-12 pl-0\">\n");
      out.write("                                                <p class=\"text-right\">                                                \n");
      out.write("                                                <button class=\"btn btn-primary\" type=\"submit\">SIMPAN</button>\n");
      out.write("                                                <button class=\"btn btn-secondary\" type=\"reset\">BATAL</button>                                                \n");
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
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <script src=\"../public/assets/vendor/jquery/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"../public/assets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\n");
      out.write("    <script src=\"../public/assets/vendor/slimscroll/jquery.slimscroll.js\"></script>\n");
      out.write("    <script src=\"../public/assets/vendor/parsley/parsley.js\"></script>\n");
      out.write("    <script src=\"../public/assets/libs/js/main-js.js\"></script>\n");
      out.write("    \n");
      out.write("    ");

        String id=request.getParameter("id_jenis");
        if (id==null){ 
      out.write("\n");
      out.write("        \n");
      function.fjenis_obat u = null;
      synchronized (_jspx_page_context) {
        u = (function.fjenis_obat) _jspx_page_context.getAttribute("u", PageContext.PAGE_SCOPE);
        if (u == null){
          u = new function.fjenis_obat();
          _jspx_page_context.setAttribute("u", u, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("u"), request);
      out.write('\n');
      out.write('\n');

    int i=jenis_obat.save(u);
    if(i>0){                        

      out.write("\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("data_jenis_obat.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("msg", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("success", request.getCharacterEncoding()));
        return;
      }
      out.write('\n');

    } else {               
        out.print("<script>alert('Data gagal Ditambahkan!')</script>");

      out.write(' ');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "form-jenis-obat.jsp", out, false);
      out.write('\n');
 } 
      out.write("\n");
      out.write("        }\n");
      out.write("    } \n");
      out.write("    %>");
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
