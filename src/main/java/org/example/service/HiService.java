package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class HiService {
    public String sayHiFromService(){
        return "hi from service";
    }
}
