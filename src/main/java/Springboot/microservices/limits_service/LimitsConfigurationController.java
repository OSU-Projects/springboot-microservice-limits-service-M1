package Springboot.microservices.limits_service;

import Springboot.microservices.limits_service.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {


    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitConfigurations(){
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
