package ServletController;

import Bean.Employee;
import Data.Data;
import ServletModel.ModelUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class LoginController extends HttpServlet {

    protected void loginValidate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int ch = ModelUtil.loginValidate(Integer.valueOf(req.getParameter("id")),(String)req.getParameter("password"));
        if (ch == 1) {
            req.setAttribute("msg","Invalid ID");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        } else if (ch == 2) {
            req.setAttribute("msg", "Incorrect Password");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        loginValidate(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        loginValidate(req, resp);
    }
}
