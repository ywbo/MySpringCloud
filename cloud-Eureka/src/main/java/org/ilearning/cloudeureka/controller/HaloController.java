package org.ilearning.cloudeureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能注释
 *
 * @author 2024-07-17
 */
@RestController
public class HaloController {
    @GetMapping("/halo")
    public String getEureka(){
        return "Halo, Eureka~";
    }
}
