package com.example.demo.webRoute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/webRoute")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class WebRouteTableController {

    @Autowired
    private WebRouteTableService webRouteTableService;

    @GetMapping
    public List<WebRouteTable> getAll() {
        return webRouteTableService.getAllFromDb1();
    }

//    @PostMapping("/create")
//    public WebRouteTable create(@RequestBody WebRouteTable webRouteTable) {
//        if (webRouteTable.getCountryId() == 1) {
//            webRouteTable = webRouteTableService.saveToDb1(webRouteTable);
//        } else if (webRouteTable.getCountryId() == 2) {
//            webRouteTable = webRouteTableService.saveToDb2(webRouteTable);
//        }
//        return webRouteTable;
//    }
}
