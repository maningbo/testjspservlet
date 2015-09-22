package testservlet;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *  ServletFilter.java
 *  Description:
 *  
 *  CreateDate: 2015年9月21日 下午2:15:19 
 * 
 *  @author 马宁波
 */
public class ServletFilter implements Filter{
	private String encoding;
	
	//项目启动时就已经进行读取 
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter 初始化方法");
		this.encoding = filterConfig.getInitParameter("encoding");
		System.out.println(this.encoding);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(this.encoding);//设置编码格式
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		Enumeration<String> headernames = httpServletRequest.getHeaderNames();
		while(headernames.hasMoreElements()){
			String headername = headernames.nextElement();
			System.out.println(headername+":"+Collections.list(httpServletRequest.getHeaders(headername)).toString());
		}
		System.out.println(httpServletRequest.getCharacterEncoding());
		System.out.println(httpServletRequest.getRequestURI());
		System.out.println(httpServletRequest.getParameterMap());
		System.out.println(httpServletRequest.getRemoteAddr());
		chain.doFilter(request, response);
	}

	//项目结束时就已经进行销毁
	@Override
	public void destroy() {
		System.out.println("filter destroy()方法");
		this.encoding = null;
	}

}
