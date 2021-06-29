package poly.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.omg.CORBA.NVList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static poly.util.CmmUtil.nvl;

@Controller
public class MainController {

	private Logger log = Logger.getLogger(this.getClass());

	@RequestMapping(value = "Sujin")
	public String Sujin() {
		log.info(this.getClass());

		return "/Test1";
	}

	@RequestMapping(value = "index")
	public String index() {
		log.info(this.getClass());

		return "/index";
	}

	@RequestMapping(value = "table")
	public String table() {
		log.info(this.getClass());

		return "/table";
	}

	@RequestMapping(value = "doPost", method = RequestMethod.POST)
	public String doPost(HttpServletRequest request, ModelMap model) throws Exception {
		String name = nvl(request.getParameter("name"));
		model.addAttribute("name", name);
		return "/get";
	}

	@RequestMapping(value = "get")
	public String get(HttpServletRequest request, ModelMap model) throws Exception {
		String name = nvl(request.getParameter("name"));
		model.addAttribute("name", name);
		return "/get";
	}

	
	@RequestMapping(value = "post")
	public String post(HttpServletRequest request, ModelMap model) throws Exception {
		String name = nvl(request.getParameter("name"));
		model.addAttribute("name", name);
		return "/post";
	}

}
