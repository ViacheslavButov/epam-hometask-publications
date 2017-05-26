package ua.kh.butov.subpub.servlet.page;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.kh.butov.subpub.servlet.AbstractController;
import ua.kh.butov.subpub.util.RoutingUtils;

@WebServlet("/sign-out")
public class SignOutController extends AbstractController {
	private static final long serialVersionUID = -8146770694377066438L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().invalidate();
		RoutingUtils.redirect("/subpub/publications", req, resp);
	}
}