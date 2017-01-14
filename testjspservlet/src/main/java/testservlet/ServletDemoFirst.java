package testservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  ServletDemoFirst.java
 *  Description:
 *  
 *  CreateDate: 2015年9月21日 上午10:56:19 
 * 
 *  @author 马宁波
 */
public class ServletDemoFirst extends HttpServlet{

	/**
	 * 默认参数
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("ServletDemoFirst init()方法");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("我是doPost()方法！用来处理POST请求");
		RequestDispatcher rd = request.getRequestDispatcher("/test/servlet.jsp");
		request.setAttribute("laiyuan","你好我是通过POST方法跳转过来的。");//存值
        request.setAttribute("name",request.getParameter("name"));//存值
        rd.forward(request,response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("我是doGet()方法！用来处理GET请求");
		RequestDispatcher rd = request.getRequestDispatcher("/test/servlet.jsp");
		request.setAttribute("laiyuan","你好我是通过GET方法跳转过来的。");//存值
		request.setAttribute("name",request.getParameter("name"));//存值
		rd.forward(request,response);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("ServletDemoFirst destroy()方法");
	}
}
