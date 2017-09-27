package cn.com.dhc.nssol.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AccessLogInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		StringBuilder accessLog = new StringBuilder();
		accessLog.append("访问用戶");
		accessLog.append("IP地址[");
		accessLog.append(request.getRemoteAddr());
		accessLog.append("]-");
		accessLog.append("访问URI[");
		accessLog.append(request.getRequestURI());
		accessLog.append("]-");
		accessLog.append("电脑信息[");
		accessLog.append(request.getHeader("user-agent"));
		accessLog.append("]-");
		System.out.println(accessLog);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
