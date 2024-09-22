package com.example.demo.webRoute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WebRouteTableService {

    @Autowired
    private WebRouteTableRepository webRouteTableRepository;

//    public List<WebRouteTable> getAllFromDb1() {
//        try {
//            DataSourceContextHolder.setDataSourceKey("db1");
//            return webRouteTableRepository.findAll();
//        } finally {
//            DataSourceContextHolder.clear();
//        }
//    }

//    public List<WebRouteTable> getAllFromDb2() {
//        try {
//            DataSourceContextHolder.setDataSourceKey("db2");
//            return webRouteTableRepository.findAll();
//        } finally {
//            DataSourceContextHolder.clear();
//        }
//    }

//    public WebRouteTable saveToDb1(WebRouteTable webRouteTable) {
//        try {
//            DataSourceContextHolder.setDataSourceKey("db1");
//            return webRouteTableRepository.save(webRouteTable);
//        } finally {
//            DataSourceContextHolder.clear();
//        }
//    }

//    public WebRouteTable saveToDb2(WebRouteTable webRouteTable) {
//        try {
//            DataSourceContextHolder.setDataSourceKey("db2");
//            return webRouteTableRepository.save(webRouteTable);
//        } finally {
//            DataSourceContextHolder.clear();
//        }
//    }

//    @Transactional("transactionManager")
    public List<WebRouteTable> getAllFromDb1() {
        return webRouteTableRepository.findAll();
    }

//    @Transactional("barTransactionManager")
//    public List<WebRouteTable> getAllFromDb2() {
//        return webRouteTableRepository.findAll();
//    }

//    @Transactional("transactionManager")
//    public WebRouteTable saveToDb1(WebRouteTable webRouteTable) {
//        return webRouteTableRepository.save(webRouteTable);
//    }

//    @Transactional("barTransactionManager")
//    public WebRouteTable saveToDb2(WebRouteTable webRouteTable) {
//        return webRouteTableRepository.save(webRouteTable);
//    }
}
