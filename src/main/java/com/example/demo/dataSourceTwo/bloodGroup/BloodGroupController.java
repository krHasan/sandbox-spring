package com.example.demo.dataSourceTwo.bloodGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dataSourceTwo/bloodGroup")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BloodGroupController {

    @Autowired
    private BloodGroupService bloodGroupService;

    @GetMapping
    public List<BloodGroup> getAllBloodGroups() {
        return bloodGroupService.findAll();
    }
}
