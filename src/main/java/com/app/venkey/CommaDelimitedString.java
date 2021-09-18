// 1) Develop a Servlet application, which has a HTML Form with two input texts, 
//first input text with a comma delimited strings with names of 
//employees and second input text with a pattern, when this HTML submitted, display the 
//result with the names of employees whose name matches with given Pattern

package com.app.venkey;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/CommaDelimitedString")
public class CommaDelimitedString extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CommaDelimitedString() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Hello World, How are you?");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String str1 = request.getParameter("txt1");
		String str2 = request.getParameter("txt2");

		List<String> list = Arrays.asList(str1.split(","));

		for (String str3 : list) {
			if (str3.contains(str2)) {
				response.getWriter().append("<br>");
				response.getWriter().append(str3);
			}
		}
	}
}
