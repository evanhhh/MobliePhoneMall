/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-09-01 06:55:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class my_005faddress_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>管理收货地址</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/shopping-mall-index.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zhonglin.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--top 开始-->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("    \t<div class=\"management f-r\">\r\n");
      out.write("            <div class=\"tanchuang-con\">\r\n");
      out.write("                <div class=\"tc-title\">\r\n");
      out.write("                    <h3>我的收货地址</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <font class=\"xinxi\">请认真填写以下信息！</font>\r\n");
      out.write("                <ul class=\"tc-con2\">\r\n");
      out.write("                    <li class=\"tc-li1\">\r\n");
      out.write("                        <p class=\"l-p\">所在地区<span>*</span></p>\r\n");
      out.write("                        <div class=\"xl-dz\">\r\n");
      out.write("                            <div class=\"dz-left f-l\">\r\n");
      out.write("                                <p>新疆</p>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li class=\"current\"><a href=\"#\">新疆</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">甘肃</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">宁夏</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">青海</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">重庆</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">长寿</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"dz-right f-l\">\r\n");
      out.write("                                <p>乌鲁木齐</p>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li class=\"current\"><a href=\"#\">乌鲁木齐</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">昌吉</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">巴音</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">郭楞</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">伊犁</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">阿克苏</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">喀什</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">哈密</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">克拉玛依</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">博尔塔拉</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">吐鲁番</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">和田</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">石河子</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">克孜勒苏</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">阿拉尔</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">五家渠</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">图木舒克</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">库尔勒</a></li>\r\n");
      out.write("                                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"clear:both;\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"tc-li1\">\r\n");
      out.write("                        <p class=\"l-p\">详细地址<span>*</span></p>\r\n");
      out.write("                        <textarea class=\"textarea1\" placeholder=\"请如实填写您的详细信息，如街道名称、门牌号、楼层号和房间号。\"></textarea>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"tc-li1\">\r\n");
      out.write("                        <p class=\"l-p\">邮政编码<span></span></p>\r\n");
      out.write("                        <input type=\"text\" />\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"tc-li1\">\r\n");
      out.write("                        <p class=\"l-p\">收货人姓名<span>*</span></p>\r\n");
      out.write("                        <input type=\"text\" />\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"tc-li1\">\r\n");
      out.write("                        <p class=\"l-p\">联系电话<span>*</span></p>\r\n");
      out.write("                        <input type=\"text\" />\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <button class=\"btn-pst2\">保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"man-info\">\r\n");
      out.write("            \t<font>您已经保存三个地址！</font>\r\n");
      out.write("                <div class=\"man-if-con\">\r\n");
      out.write("                \t<div class=\"man-tit\">\r\n");
      out.write("                        <p class=\"p1\">收货人</p>\r\n");
      out.write("                        <p class=\"p2\">所在地区</p>\r\n");
      out.write("                        <p class=\"p3\">详细地址</p>\r\n");
      out.write("                        <p class=\"p4\">邮编</p>\r\n");
      out.write("                        <p class=\"p5\">电话/手机</p>\r\n");
      out.write("                        <p class=\"p6\">操作</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"man-ul1\">\r\n");
      out.write("                    \t<li>\r\n");
      out.write("                        \t<p class=\"p1\">赵珍珍</p>\r\n");
      out.write("                        \t<p class=\"p2\">重庆 重庆市 南岸区</p>\r\n");
      out.write("                        \t<p class=\"p3\">南坪左岸阳光c2-10-3</p>\r\n");
      out.write("                        \t<p class=\"p4\">563000</p>\r\n");
      out.write("                        \t<p class=\"p5\">18983945092</p>\r\n");
      out.write("                        \t<p class=\"p6\">\r\n");
      out.write("                            \t<a href=\"#\">修改</a> | \r\n");
      out.write("                            \t<a href=\"#\">删除</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"p7\"><a href=\"#\">默认地址</a></p>\r\n");
      out.write("                            <div style=\"clear:both;\"></div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                        \t<p class=\"p1\">赵珍珍</p>\r\n");
      out.write("                        \t<p class=\"p2\">重庆 重庆市 南岸区 南坪街道</p>\r\n");
      out.write("                        \t<p class=\"p3\">南岸区南坪福红路19号乙单元7-2</p>\r\n");
      out.write("                        \t<p class=\"p4\">000000</p>\r\n");
      out.write("                        \t<p class=\"p5\">18983945092</p>\r\n");
      out.write("                        \t<p class=\"p6\">\r\n");
      out.write("                            \t<a href=\"#\">修改</a> | \r\n");
      out.write("                            \t<a href=\"#\">删除</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <div style=\"clear:both;\"></div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                        \t<p class=\"p1\">赵珍珍</p>\r\n");
      out.write("                        \t<p class=\"p2\">浙江省 杭州市 余杭区崇贤街道</p>\r\n");
      out.write("                        \t<p class=\"p3\">崇贤镇大安工业区彩诗纺织有限公司</p>\r\n");
      out.write("                        \t<p class=\"p4\">311108</p>\r\n");
      out.write("                        \t<p class=\"p5\">18983945092</p>\r\n");
      out.write("                        \t<p class=\"p6\">\r\n");
      out.write("                            \t<a href=\"#\">修改</a> | \r\n");
      out.write("                            \t<a href=\"#\">删除</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <div style=\"clear:both;\"></div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bottom.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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