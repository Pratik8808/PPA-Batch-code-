package com.marvellous.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PPA
{
    @GetMapping("/Pune")
    public String Display()
    {
        return "Jay Ganesh....";
    }

    @GetMapping("/Mumbai")
    public String fun()
    {
        return "Inside Mumbai Route";
    }

}
