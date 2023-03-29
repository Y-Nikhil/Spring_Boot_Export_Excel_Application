package com.ashokit;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportRestController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/Excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception {
		
		response.setContentType("application/octet-stream");
		
		String headerKey = "Content-Disposition";
		String HeaderValue = "attachment; filename= books.xls";
		
		response.setHeader(headerKey, HeaderValue);
		
		bookService.generateExcel(response);
		
	}
}
