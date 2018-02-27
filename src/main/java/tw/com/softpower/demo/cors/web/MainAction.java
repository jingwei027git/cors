package tw.com.softpower.demo.cors.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tw.com.softpower.demo.cors.dto.Client;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("/main")
@Controller
public class MainAction {

    @ModelAttribute
    public void setVaryResponseHeader(HttpServletResponse response) {
        response.setHeader("P3P", "CP=CAO PSA OUR");
    }

    @GetMapping("/{id}")
    public String read(@PathVariable Long id) {
        return "/index";
    }

}
