package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_002dadd_002duser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Form Input User|| Apotek Siaga</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../public/assets/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"../public/assets/vendor/fonts/circular-std/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../public/assets/libs/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css\">\n");
      out.write("    \n");
      out.write("            <div class=\"container-fluid  dashboard-content\">\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- pageheader -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12\">\n");
      out.write("                        <div class=\"page-header\">                            \n");
      out.write("                            <h2 class=\"pageheader-title\">Form Input User</h2>\n");
      out.write("                            <div class=\"page-breadcrumb\">\n");
      out.write("                                <nav aria-label=\"breadcrumb\">\n");
      out.write("                                    <ol class=\"breadcrumb\">\n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"../index.jsp\" class=\"breadcrumb-link\">Dashboard</a></li>                                        \n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"\" class=\"breadcrumb-link\">Forms</a></li>\n");
      out.write("                                        <li class=\"breadcrumb-item active\" aria-current=\"page\">Input User</li>\n");
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
      out.write("                                    <form class=\"needs-validation\" name=\"add-user\" method=\"POST\" action=\"add-user.jsp\" validate>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom01\">ID User</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"IDuser\" id=\"validationCustom01\" placeholder=\"Kode\" required>\n");
      out.write("                                                <div class=\"valid-feedback\">\n");
      out.write("                                                    Looks good!\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>                                            \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom03\">Nama User</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"NamaUser\" id=\"validationCustom03\" placeholder=\"Nama Lengkap\" required>\n");
      out.write("                                                <div class=\"valid-feedback\">\n");
      out.write("                                                    Looks good!\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>                                                                                \n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom01\">Username</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"Username\" id=\"validationCustom01\" placeholder=\"Username\" required>\n");
      out.write("                                                <div class=\"valid-feedback\">\n");
      out.write("                                                    Looks good!\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div> \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom01\">Password</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"Password\" id=\"validationCustom01\" placeholder=\"Password\" required>\n");
      out.write("                                                <div class=\"valid-feedback\">\n");
      out.write("                                                    Looks good!\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 \">\n");
      out.write("                                                <label for=\"validationCustom03\">Level</label>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"Level\" id=\"validationCustom03\" value=\"2\" readonly required>\n");
      out.write("                                                <div class=\"valid-feedback\">\n");
      out.write("                                                    Looks good!\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-12 pl-0\">\n");
      out.write("                                                <p class=\"text-right\">                                                \n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-primary\" name=\"submit\">SIMPAN</button>\n");
      out.write("                                                    <button type=\"reset\" class=\"btn btn-secondary\" name=\"reset\">BATAL</button>\n");
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
      out.write("    <script>\n");
      out.write("    $('#form').parsley();\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("    // Example starter JavaScript for disabling form submissions if there are invalid fields\n");
      out.write("    (function() {\n");
      out.write("        'use strict';\n");
      out.write("        window.addEventListener('load', function() {\n");
      out.write("            // Fetch all the forms we want to apply custom Bootstrap validation styles to\n");
      out.write("            var forms = document.getElementsByClassName('needs-validation');\n");
      out.write("            // Loop over them and prevent submission\n");
      out.write("            var validation = Array.prototype.filter.call(forms, function(form) {\n");
      out.write("                form.addEventListener('submit', function(event) {\n");
      out.write("                    if (form.checkValidity() === false) {\n");
      out.write("                        event.preventDefault();\n");
      out.write("                        event.stopPropagation();\n");
      out.write("                    }\n");
      out.write("                    form.classList.add('was-validated');\n");
      out.write("                }, false);\n");
      out.write("            });\n");
      out.write("        }, false);\n");
      out.write("    })();\n");
      out.write("    </script>\n");
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
