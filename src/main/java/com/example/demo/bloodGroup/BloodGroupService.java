package com.example.demo.bloodGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodGroupService {

    @Autowired
    private BloodGroupRepository bloodGroupRepository;

    public List<BloodGroup> findAll() {
        return bloodGroupRepository.findAll();
    }
}
