package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeServlet extends HttpServlet{

	public LifeServlet() {
		System.out.println("LifeServlet()");
	}
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}

	
	
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

	public void service(
			HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		System.out.println("service()");
		//通过继承自GenericServlet提供的方法
		//来获得ServletConfig对象。
		ServletConfig config = 
				getServletConfig();
		//使用ServletConfig对象提供的方法来
		//读取初始化参数
		String company = 
				config.getInitParameter("company");
		System.out.println("company:" + company);
	}
	
	
	
	
	
}
