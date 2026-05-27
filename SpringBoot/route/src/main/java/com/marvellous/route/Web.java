package com.marvellous.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web
{
    @GetMapping("web")
    public String WebDisplay()
    {
         return "Inside The web Development";
    }
}
