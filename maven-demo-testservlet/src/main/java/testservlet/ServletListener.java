package testservlet;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *  ServletListener.java
 *  Description:
 *  
 *  CreateDate: 2015年9月22日 上午11:19:44 
 * 
 *  @author 马宁波
 */
public class ServletListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		System.out.println("session创建");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		System.out.println("session销毁");
	}
}
