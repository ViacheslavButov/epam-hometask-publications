package ua.kh.butov.subpub.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.kh.butov.subpub.util.RoutingUtils;

@WebFilter(filterName="ErrorHandlerFilter")
public class ErrorHandlerFilter extends AbstractFilter {
	@Override
	public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws IOException, ServletException {
		try {
			chain.doFilter(req, resp);
		} catch (Throwable th) {
			String requestUrl = req.getRequestURI();
			LOGGER.error("Request " + requestUrl + " failed: " + th.getMessage(), th);
			RoutingUtils.forwardToPage("error.jsp", req, resp);
		}
	}
}