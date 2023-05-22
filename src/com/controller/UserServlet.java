package com.controller;


import com.model.entity.User;
import com.model.service.UserService;
import com.model.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        boolean result = false;
        String action = request.getParameter("action");
        String name = request.getParameter("userName");
        String user1 = request.getParameter("user");
        HttpSession session = request.getSession();
        session.setAttribute("USER", "请登录！");
        if (name == null||"请登录！".equals(name)||"".equals(user1)) {
            session.setAttribute("USER", user1);
            result = false;
        } else if ("info".equals(action)) {
            String userName = request.getParameter("userName");
            String userPwd = request.getParameter("userPwd");
            System.out.println(userService.infoUserService(userName, userPwd));
            if (userService.infoUserService(userName, userPwd) != null) {
                result = true;
                session.setAttribute("USER", name);
            } else {
                result = false;
            }
        }else if ("add".equals(action)) {
            String userName = request.getParameter("userName");
            String userEmail = request.getParameter("userEmail");
            String userPwd = request.getParameter("userPwd");

            String addRess="黄冈科技职业学院（何家湖校区）";
            User user11 = new User(userName, userEmail,userPwd,addRess);
            System.out.println(user11);
            if (userName != null && userEmail != null && userPwd != null) {
                if (userName.length() >= 1 && userPwd.length() >= 6) {
                    if (userService.addUserService(user11) > 0) {
                        result = true;
                        String username = request.getParameter("userName");
                        session.setAttribute("USER", username);
                    } else {
                        result = false;
                        request.setAttribute("register", "您输入的数据有误！");
                    }
                } else {
                    request.setAttribute("register", "您输入的用户名为空或密码长度小于6位，请重新输入！");
                }

            } else {
                request.setAttribute("register", "您输入的数据为空，请重新输入！");
            }

        }else {
            result=true;
        }
        if (result) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "用户名或密码输入错误!");
            request.getRequestDispatcher("/login.jsp").forward(request, response);

        }

    }
}
