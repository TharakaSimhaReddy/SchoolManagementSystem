package com.thari.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thari.project.entity.Admin;
import com.thari.project.service.AdminService;
import com.thari.project.service.AdminServiceImp;
@WebServlet("/validateAdmin")
public class ValidateAdmin extends HttpServlet{
	
	private static final long seialVersionUID=1L; 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		AdminService adminService = new AdminServiceImp();
		
		Admin admin = adminService.validateAdmin(req.getParameter("name"),req.getParameter("password"));
		if(admin != null) {
			HttpSession session=req.getSession();
			session.setAttribute("admin", admin);
			resp.sendRedirect("adminMenu.jsp");
		}else {
			resp.sendRedirect("invalidAdmin.jsp");
		}
	}
		
	

}
