package com.sericefeign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
