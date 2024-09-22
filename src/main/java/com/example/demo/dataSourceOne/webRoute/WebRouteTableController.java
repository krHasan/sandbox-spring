package com.example.demo.dataSourceOne.webRoute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dataSourceOne/webRoute")
public class WebRouteTableController {

    @Autowired
    private WebRouteTableService webRouteTableService;

    @GetMapping
    public List<WebRouteTable> getAll() {
        return webRouteTableService.findAll();
    }
}
