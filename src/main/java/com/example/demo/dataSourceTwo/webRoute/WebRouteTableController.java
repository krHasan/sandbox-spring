package com.example.demo.dataSourceTwo.webRoute;

import com.example.demo.dataSourceOne.webRoute.WebRouteTable;
import com.example.demo.dataSourceOne.webRoute.WebRouteTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("webRouteTableControllerForDb2")
@RequestMapping("/api/dataSourceTwo/webRoute")
public class WebRouteTableController {

    @Autowired
    private WebRouteTableService webRouteTableService;

    @GetMapping
    public List<WebRouteTable> getAll() {
        return webRouteTableService.findAll();
    }
}
