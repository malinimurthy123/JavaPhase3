package com.example.FlyAwayLogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("authenticateServlet")
public class AuthenticateServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


//		Get a reference to the Session
        HttpSession session = request.getSession();

//		Check whether user is already logged in
        if(session.getAttribute("userName") != null) {
        //Reditrect to the dashboard
            response.sendRedirect("dashboard.jsp");
        }
        else {

//		Get the userName from the request
            String userName = request.getParameter("userName");

            session.setAttribute("userName", userName);

//		Redirect to the Dashboard
            response.sendRedirect("dashboard.jsp");
        }
    }

}
