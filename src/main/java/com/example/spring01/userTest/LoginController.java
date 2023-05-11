package com.example.spring01.userTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LoginController {
	
    @GetMapping("/login")
    public String gatewayList(Model model) throws Exception {
    	
        return "user/login/login";
    }
    
    
}
