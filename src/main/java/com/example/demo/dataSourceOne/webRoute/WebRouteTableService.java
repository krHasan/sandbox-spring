package com.example.demo.dataSourceOne.webRoute;

//import com.example.demo.util.DataSourceContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WebRouteTableService {

    @Autowired
    private WebRouteTableRepository webRouteTableRepository;

//    @Transactional("db2TransactionManager")
    public List<WebRouteTable> findAll() {
        return webRouteTableRepository.findAll();
    }
}
