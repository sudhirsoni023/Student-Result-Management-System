package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Fonts -->\n");
      out.write("    <link rel=\"dns-prefetch\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Raleway:300,400,600\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"icon\" href=\"Favicon.png\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<main class=\"my-form\">\n");
      out.write("    <div class=\"cotainer\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header\">Insert New Result</div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form name=\"my-form\" onsubmit=\"return validform()\" action=\"insertNewResult.jsp\" method=\"post\">\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <label for=\"full_name\" class=\"col-md-4 col-form-label text-md-right\">Roll Number</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\"class=\"form-control\" name=\"rollNo\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <label for=\"email_address\" class=\"col-md-4 col-form-label text-md-right\">Engg. Physics-I</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\" name=\"subject1\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <label for=\"user_name\" class=\"col-md-4 col-form-label text-md-right\">Engg. Chemistry</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\" name=\"subject2\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <label for=\"phone_number\" class=\"col-md-4 col-form-label text-md-right\">Engg. Mathematics-I</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\" name=\"subject3\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <label for=\"present_address\" class=\"col-md-4 col-form-label text-md-right\">Basic Electrical Engg</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\" name=\"subject4\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <label for=\"permanent_address\" class=\"col-md-4 col-form-label text-md-right\">Electronic Engg.</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\" name=\"subject5\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                 <div class=\"form-group row\">\n");
      out.write("                                    <label for=\"permanent_address\" class=\"col-md-4 col-form-label text-md-right\">Engg. Chemistry Lab</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\" name=\"subject6\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                 <div class=\"form-group row\">\n");
      out.write("                                    <label for=\"permanent_address\" class=\"col-md-4 col-form-label text-md-right\">Engg. Physics Lab</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"subject7\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                    <div class=\"col-md-6 offset-md-4\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                       Save\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</main>\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html> \n");
      out.write("  </div>\n");
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
