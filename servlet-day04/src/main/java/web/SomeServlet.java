package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomeServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		System.out.println("service()");
		//���������Դ·��
		String uri = request.getRequestURI();
		System.out.println("uri:" + uri);
		//����������Դ·��
		String action = 
			uri.substring(
					uri.lastIndexOf("/"),
					uri.lastIndexOf("."));
		System.out.println("action:" + action);
		//���ݷ����������ͬ�Ĵ���
		if("/list".equals(action)){
			
			
			
			System.out.println("����Ա���б�����");
			
			
		}else if("/add".equals(action)){
			System.out.println("�������Ա������");
		}
	}
}




