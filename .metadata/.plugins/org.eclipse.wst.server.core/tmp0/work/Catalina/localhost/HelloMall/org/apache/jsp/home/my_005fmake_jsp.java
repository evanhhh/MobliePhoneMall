/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-09-01 06:46:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class my_005fmake_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>预约界面</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/shopping-mall-index.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zhonglin.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index_top.jsp", out, false);
      out.write("\r\n");
      out.write("    <!--内容开始-->\r\n");
      out.write("    <div class=\"interface\">\r\n");
      out.write("    \t<div class=\"in-tit\">\r\n");
      out.write("        \t<h3>商品信息</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"commodity\">\r\n");
      out.write("        \t<div class=\"matong f-l\">\r\n");
      out.write("            \t<a href=\"#\"><img src=\"images/in-matong.gif\" /></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"com-con f-l\">\r\n");
      out.write("            \t<h3>卫欲无限 新一代双漩冲刷虹吸式连体坐便器 马桶 座便器2163400mm坑距</h3>\r\n");
      out.write("                <p class=\"pt\">重力出击，超强冲力，排污更流畅</p>\r\n");
      out.write("                <dl>\r\n");
      out.write("                \t<dt>规格</dt>\r\n");
      out.write("                    <dd>尺码：400mml坑距<br />颜色：白色</dd>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl>\r\n");
      out.write("                \t<dt>促销</dt>\r\n");
      out.write("                    <dd><span class=\"sp1\">满赠</span>      指定商品满1件，赠送卫欲无限 座便器配件三件套</dd>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl>\r\n");
      out.write("                \t<dt>送货至</dt>\r\n");
      out.write("                    <dd>重庆南岸区（包邮）</dd>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl>\r\n");
      out.write("                \t<dt>价格</dt>\r\n");
      out.write("                    <dd><span class=\"sp2\">¥588.00</span></dd>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </dl>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"clear:both;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \t<div class=\"in-tit\">\r\n");
      out.write("        \t<h3>客户信息</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"kehu\">\r\n");
      out.write("        \t<div class=\"p-ip\">\r\n");
      out.write("            \t<p>联系人</p>\r\n");
      out.write("                <input type=\"text\" placeholder=\"请输入手机验证码\" />\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div><br />\r\n");
      out.write("        \t<div class=\"p-ip\">\r\n");
      out.write("            \t<p>联系方式</p>\r\n");
      out.write("                <input type=\"text\" placeholder=\"请输入密码\" />\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div><br />\r\n");
      out.write("        \t<div class=\"p-ip\">\r\n");
      out.write("            \t<p>联系时间</p>\r\n");
      out.write("                <input type=\"text\" placeholder=\"请再次确认密码\" />\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div><br />\r\n");
      out.write("            <button>提交预约</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--底部服务-->\r\n");
      out.write("    <div class=\"ft-service\">\r\n");
      out.write("    \t<div class=\"w1200\">\r\n");
      out.write("        \t<div class=\"sv-con-l2 f-l\">\r\n");
      out.write("            \t<dl>\r\n");
      out.write("                \t<dt><a href=\"#\">新手上路</a></dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                    \t<a href=\"#\">购物流程</a>\r\n");
      out.write("                    \t<a href=\"#\">在线支付</a>\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl>\r\n");
      out.write("                \t<dt><a href=\"#\">配送方式</a></dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                    \t<a href=\"#\">货到付款区域</a>\r\n");
      out.write("                    \t<a href=\"#\">配送费标准</a>\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl>\r\n");
      out.write("                \t<dt><a href=\"#\">购物指南</a></dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                    \t<a href=\"#\">常见问题</a>\r\n");
      out.write("                    \t<a href=\"#\">订购流程</a>\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl>\r\n");
      out.write("                \t<dt><a href=\"#\">售后服务</a></dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                    \t<a href=\"#\">售后服务保障</a>\r\n");
      out.write("                    \t<a href=\"#\">退款说明</a>\r\n");
      out.write("                    \t<a href=\"#\">新手选购商品总则</a>\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl>\r\n");
      out.write("                \t<dt><a href=\"#\">关于我们</a></dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                    \t<a href=\"#\">投诉与建议</a>\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \t<div class=\"sv-con-r2 f-r\">\r\n");
      out.write("            \t<p class=\"sv-r-tle\">187-8660-5539</p>\r\n");
      out.write("            \t<p>周一至周五9:00-17:30</p>\r\n");
      out.write("            \t<p>（仅收市话费）</p>\r\n");
      out.write("            \t<a href=\"#\" class=\"zxkf\">24小时在线客服</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"clear:both;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index_bottom.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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