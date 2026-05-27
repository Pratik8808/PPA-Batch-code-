package com.marvellous.com.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    @Autowired
    public HardDisk hobj;
    @Autowired
    public Ram Robj;

    @GetMapping("Laptop")
    public String LaptopDisplay()
    {
        return hobj.HDDDisplay()+" and "+Robj.RamDisplay();
    }
}
