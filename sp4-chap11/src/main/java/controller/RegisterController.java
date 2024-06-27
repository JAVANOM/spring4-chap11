package controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.MemberRegisterService;
import spring.RegisterRequest;

@Controller
public class RegisterController {
    
	private MemberRegisterService memberRegisterService;
	
	public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	

	@RequestMapping("/register/step1")
	public String handleStep1() {
		
		return "register/step1";
		
	}
	// 요청 파라미터 접근
	@RequestMapping(value="/register/step2", method= RequestMethod.POST)
	public String handleStep2(HttpServletRequest request, Model model) {
		String agreeParam = request.getParameter("agree");
		if(agreeParam == null || !agreeParam.equals("true")) {
			return "register/step1";
		}
		
		model.addAttribute("registerRequest", new RegisterRequest());
		
		
		return "register/step2";
	}
	
	/*// 요청 파라미터 접근
	@RequestMapping(value="/register/step2", method= RequestMethod.POST)
	public String handleStep2(
			@RequestParam(value="agree", defaultValue="false") Boolean agreeVal) {
		if(!agreeVal) {
			return "register/step1";
		}
		return "register/step2";
	}*/
	
	// redirect: "/" 시작한다면 웹 어플리케이션 기준으로 이동 경로를 생성
	@RequestMapping(value="/register/step2", method= RequestMethod.GET)
	public String handleStep2get() {
		
		return "redirect:/register/step1";
	}
	
	// 해당 코드는 요청하는 파라미터 개수가 증가 할 수록 코드가 길어 질수 있다.
	/*@RequestMapping(value="/register/step3", method = RequestMethod.POST )
	public String handleStep3(HttpServletRequest request) {
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		//..... 
		
		
		return "register/step3";
	}*/
	
	
	@RequestMapping(value="/register/step3", method=RequestMethod.POST)
	public String handleStep3(@ModelAttribute("formData") RegisterRequest regReq) {
		
		try {
			memberRegisterService.regist(regReq);
			return "register/step3";
		} catch (Exception e) {
			return "register/step2";
		}
	}
	
	
	
	
}
