package pri.zjj.crudGenerator.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *ClassName:DefaultController
 *@Description:
 *
 *@Author zjj
 *@Date 2019年10月22日
 *@Version 1.0
 */

@RestController
@RequestMapping("/model")
public class DefaultController {
	@RequestMapping("/java")
	public ModelAndView java(Model model) {
		model.addAttribute("className", "Test");
		return new ModelAndView("ControllerTemplate");
	}

}
