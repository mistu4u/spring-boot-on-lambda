package org.example.controller;

import org.example.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HiController {
    @Autowired
    private HiService hiService;
    @GetMapping
    ResponseEntity<String> sayHi() {
        return ResponseEntity.ok(hiService.sayHiFromService());
    }
}
