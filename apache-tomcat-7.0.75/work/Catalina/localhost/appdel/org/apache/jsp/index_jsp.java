/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.75
 * Generated at: 2018-03-10 17:57:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Incidentes Ayacucho</title>\n");
      out.write("\n");
      out.write("        <link href='http://api.tiles.mapbox.com/mapbox.js/v1.4.2/mapbox.css' rel='stylesheet' />\n");
      out.write("        <script src='http://api.tiles.mapbox.com/mapbox.js/v1.4.2/mapbox.js'></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/jquery-ui.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/jquery.ptTimeSelect.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/MarkerCluster.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/MarkerCluster.Default.css\" />     \n");
      out.write("        <script src=\"css/leaflet.markercluster.js\"></script>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "plantillas/styles.jspf", out, false);
      out.write("\n");
      out.write("            <link href='css/style-index.css' rel='stylesheet' />            \n");
      out.write("\n");
      out.write("            <script src=\"http://localhost:8080/appdel/SObtener_crimenes\"></script>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "plantillas/header.jspf", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"map\"></div>\n");
      out.write("\n");
      out.write("        <div id=\"busqueda\">\n");
      out.write("            <div class=\"content well\">\n");
      out.write("                <h4>Busqueda de incidentes</h4>\n");
      out.write("\n");
      out.write("                <div class=\"row-fluid\">                    \n");
      out.write("                    <div class=\"span2\">Del:</div>\n");
      out.write("                    <div class=\"span10\"> \n");
      out.write("                        <input type=\"text\" name=\"fecha\" value=\"\"  id=\"fecha_inicio\" style=\"width: 150px\"  readonly>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row-fluid\">                    \n");
      out.write("                    <div class=\"span2\">Al:</div>\n");
      out.write("                    <div class=\"span10\"> \n");
      out.write("                        <input type=\"text\" name=\"fecha\" value=\"\"  id=\"fecha_fin\" style=\"width: 150px\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row-fluid\">                    \n");
      out.write("                    <div class=\"span6\"> <button type=\"submit\" class=\"btn btn-primary\" id=\"button_filtrar\">  Filtrar</button></div>\n");
      out.write("                    <div class=\"span6\"> <button type=\"submit\" class=\"btn btn-primary\" id=\"button_todos\">Todos</button></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content well\">\n");
      out.write("                <h4>Tipos de incidentes</h4>\n");
      out.write("                <ul id='tipo_incidentes'>\n");
      out.write("                    <li> <a href='#' id='Robo'>Robo</a></li>\n");
      out.write("                    <li><a href='#' id='Agresión'>Agresión</a>    </li>                                                \n");
      out.write("                    <li> <a href='#' id='Accidente'>Accidente</a>\n");
      out.write("                    <li> <a href='#' id='Violencia Familiar'>Violencia Familiar</a></li>\n");
      out.write("                    <li> <a href='#' id='Otros Incidentes'>Otros Incidentes</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Ventana de Detalle de delito\n");
      out.write("               \n");
      out.write("        -->\n");
      out.write("        <div id=\"modal\">\n");
      out.write("            <div id=\"popover\" class=\"modal container hide fade\" tabindex=\"-1\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("\n");
      out.write("                    <h1>\n");
      out.write("                        <spam class=\"tipo\"></spam>\n");
      out.write("                    </h1>\n");
      out.write("\n");
      out.write("                    <strong>Fecha:</strong> <spam class=\"fecha\"></spam>, <spam class=\"hora\"></spam> <br>\n");
      out.write("\n");
      out.write("                    <strong>Registrado por:</strong><spam class=\"usuario\"></spam> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <div class=\"row-fluid\">\n");
      out.write("\n");
      out.write("                        <div class=\"span12\">\n");
      out.write("                            <p class=\"descripcion\"></p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row-fluid\">\n");
      out.write("\n");
      out.write("                        <div class=\"span12\">\n");
      out.write("                            <strong>Direción de Referencia: </strong> <spam class=\"direccion_ref\"></spam>\n");
      out.write("                        </div>      \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row-fluid\">\n");
      out.write("                        <div class=\"span3\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"span6\">\n");
      out.write("\n");
      out.write("                            <img class=\"imagen\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"span3\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" data-dismiss=\"modal\" class=\"btn btn-primary\">Cerrar</button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"#popover\"  class=\"click\"  data-toggle=\"modal\"></a>\n");
      out.write("\n");
      out.write("            <!--Fin detalle de delito-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <script src=\"lib/jquery-1.8.2.js\"></script>\n");
      out.write("        <script src=\"lib/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"lib/jquery.ptTimeSelect.js\"></script>\n");
      out.write("        <script src=\"lib/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"lib/underscore-min.js\"></script>\n");
      out.write("        <script src=\"lib/moment.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"js/mapa.js\"></script>\n");
      out.write("        <script src=\"js/detalle.js\"></script>\n");
      out.write("        <script src=\"js/app.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
