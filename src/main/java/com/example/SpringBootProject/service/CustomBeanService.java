package com.example.SpringBootProject.service;

import com.example.SpringBootProject.CustomBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomBeanService {
    private final CustomBean customBean;

    @Autowired
    public CustomBeanService(CustomBean customBean) {
        this.customBean = customBean;
    }

    public void useCustomBean(){
        customBean.displayCustomBean();
    }
}
