package com.applicationSecurity.endpointDemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class endpointDemoController {

    @PostMapping(value = "welcome")
    public String welcome() {
        return "Welcome desde un EndPoint Seguro";
    }

}
