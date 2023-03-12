package com.example.webapp1.hello.Controllers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/say-hello")
public class SayHelloController {

    @GetMapping("/text")
    @ResponseBody //returns the string as it is.
    public String sayHelloWorld()
    {
        return "Hello! Whats up";
    }

    @GetMapping("/html")
    public String sayHelloWorldHtml()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page - Changed</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body - Changed");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @GetMapping("/jsp")
    public String sayHelloJsp()
    {
        // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp - ALL jsp files should be created in this path
        return "sayHello";

    }
}
