package com.example.demo.dataSourceTwo.bloodGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BloodGroupService {

    @Autowired
    private BloodGroupRepository bloodGroupRepository;

//    @Transactional("db2TransactionManager")
    public List<BloodGroup> findAll() {
        return bloodGroupRepository.findAll();
    }
}