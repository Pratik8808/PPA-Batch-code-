package com.marvellous.com.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class HardDisk
{
    public String HDDDisplay()
    {
        return "HardDisk is of 512gb ";
    }
}
