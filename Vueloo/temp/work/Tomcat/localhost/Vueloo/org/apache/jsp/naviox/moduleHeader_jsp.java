/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2022-10-18 14:12:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.naviox;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.application.meta.MetaModule;
import org.openxava.util.Is;
import com.openxava.naviox.util.NaviOXPreferences;
import org.openxava.util.Users;
import com.openxava.naviox.util.Organizations;

public final class moduleHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1666101372977L));
    _jspx_dependants.put("jar:file:/C:/Users/ADMIN/Desktop/openxava-6.6.3/workspace/Vueloo/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1426000268000L));
    _jspx_dependants.put("jar:file:/C:/Users/ADMIN/Desktop/openxava-6.6.3/workspace/Vueloo/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1426000268000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1666101373006L));
    _jspx_dependants.put("/naviox/../xava/imports.jsp", Long.valueOf(1666101370828L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.openxava.naviox.util.NaviOXPreferences");
    _jspx_imports_classes.add("com.openxava.naviox.util.Organizations");
    _jspx_imports_classes.add("org.openxava.util.Users");
    _jspx_imports_classes.add("org.openxava.util.Is");
    _jspx_imports_classes.add("org.openxava.application.meta.MetaModule");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      com.openxava.naviox.Modules modules = null;
      synchronized (session) {
        modules = (com.openxava.naviox.Modules) _jspx_page_context.getAttribute("modules", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (modules == null){
          modules = new com.openxava.naviox.Modules();
          _jspx_page_context.setAttribute("modules", modules, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");

String module = context.getCurrentModule(request);
boolean hasModules = modules.hasModules(request);
boolean isFirstSteps = com.openxava.naviox.Modules.FIRST_STEPS.equals(module);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"module_header_left\"> \t\t\t\r\n");
      out.write("\t");
 if (!isFirstSteps) { 
      out.write("\r\n");
      out.write("\t\t<a id=\"module_header_menu_button\" href=\"javascript:naviox.showModulesList('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("')\">\r\n");
      out.write("\t\t\t<i class=\"mdi mdi-menu\"></i></a>\r\n");
      out.write("\t");
 } 
      out.write("\t\t\t\t\r\n");
      out.write("\t");

	String organizationName = modules.getOrganizationName(request);
	if (!Is.emptyString(organizationName)) organizationName += " - ";
	String title = organizationName + modules.getApplicationLabel(request);
	
      out.write('\r');
      out.write('\n');
      out.write('	');
 if (hasModules && !isFirstSteps) { 
      out.write("\r\n");
      out.write("\t\t<span id=\"module_extended_title\">\r\n");
      out.write("\t\t\t");
      out.print(title);
      out.write(" :\r\n");
      out.write("\t\t</span>\t \r\n");
      out.write("\t");

	}
	else if ("SignIn".equals(module)) {
	
      out.write("\r\n");
      out.write("\t\t");
      out.print(title);
      out.write('\r');
      out.write('\n');
      out.write('	');

	}

	for (MetaModule metaModule: modules.getTopModules()) {
		if (metaModule.getName().equals("SignIn")) continue;
		boolean isSelected = metaModule.getName().equals(request.getParameter("module")); 
		String selected = isSelected?"selected":"unselected";
		if (isSelected) {
	
      out.write("\t\t\r\n");
      out.write("\t\t<span class=\"selected\">");
      out.print(metaModule.getLabel(request.getLocale()));
      out.write("</span>\r\n");
      out.write("\t");

		}
		else {
	
      out.write("\r\n");
      out.write("\t\t<a href=\"");
      out.print(modules.getModuleURI(request, metaModule));
      out.write("?retainOrder=true\" class=\"unselected\">");
      out.print(metaModule.getLabel(request.getLocale()));
      out.write("</a>\r\n");
      out.write("\t");

		}	
	}
	
      out.write("\t\t\t\t\r\n");
      out.write("\t&nbsp;\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("<div id=\"module_header_right\">\r\n");
      out.write("\t<a id=\"bookmark\" href=\"javascript:naviox.bookmark()\" title=\"");
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f0_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f0.setParent(null);
        // /naviox/moduleHeader.jsp(60,61) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f0.setKey(modules.isCurrentBookmarked(request)?"unbookmark_module":"bookmark_module");
        int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
        if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
        _jspx_th_xava_005fmessage_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f0_reused);
      }
      out.write("\"> \r\n");
      out.write("\t\t<i class='mdi mdi-star");
      out.print(modules.isCurrentBookmarked(request)?"":"-outline");
      out.write("'></i> \r\n");
      out.write("\t</a> \t\t\t\t\r\n");
      out.write("\t<span id=\"sign_in_out\"> \r\n");
      out.write("\t\t");

		if (Is.emptyString(NaviOXPreferences.getInstance().getAutologinUser())) {
			String userName = Users.getCurrent();
			String currentModule = request.getParameter("module");
			boolean showSignIn = userName == null && !currentModule.equals("SignIn");						
			if (showSignIn) {
				String selected = "SignIn".equals(currentModule)?"selected":"";
				
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/m/SignIn\" class=\"sign-in ");
      out.print(selected);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_xava_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t");

			}
			if (userName != null) {
				String organization = Organizations.getCurrent(request);
				if (organization == null) organization = "";
				
      out.write("\r\n");
      out.write("\t\t\t\t<a  href=\"");
      out.print(request.getContextPath());
      out.write("/naviox/signOut.jsp?organization=");
      out.print(organization);
      out.write("\" class=\"sign-in\">");
      if (_jspx_meth_xava_005fmessage_005f2(_jspx_page_context))
        return;
      out.write(' ');
      out.write('(');
      out.print(userName);
      out.write(")</a>\r\n");
      out.write("\t\t\t\t");

			}
		} 
		
      out.write("\r\n");
      out.write("\t</span>\t\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t");
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

  private boolean _jspx_meth_xava_005fmessage_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f1 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    boolean _jspx_th_xava_005fmessage_005f1_reused = false;
    try {
      _jspx_th_xava_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f1.setParent(null);
      // /naviox/moduleHeader.jsp(73,5) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fmessage_005f1.setKey("signin");
      int _jspx_eval_xava_005fmessage_005f1 = _jspx_th_xava_005fmessage_005f1.doStartTag();
      if (_jspx_th_xava_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
      _jspx_th_xava_005fmessage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f2 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    boolean _jspx_th_xava_005fmessage_005f2_reused = false;
    try {
      _jspx_th_xava_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f2.setParent(null);
      // /naviox/moduleHeader.jsp(81,111) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fmessage_005f2.setKey("signout");
      int _jspx_eval_xava_005fmessage_005f2 = _jspx_th_xava_005fmessage_005f2.doStartTag();
      if (_jspx_th_xava_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
      _jspx_th_xava_005fmessage_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f2, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f2_reused);
    }
    return false;
  }
}
