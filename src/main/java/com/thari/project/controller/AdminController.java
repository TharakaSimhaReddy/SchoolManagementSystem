package com.thari.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thari.project.entity.Admin;
import com.thari.project.service.AdminService;
import com.thari.project.service.AdminServiceImp;
@WebServlet("/saveAdmin")
public class AdminController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		Admin admin = new Admin();
		admin.setName(name);
		admin.setPassword(password);
		AdminService adminService = new AdminServiceImp();
		adminService.saveAdmin(admin); 
		
		}
		
	}


