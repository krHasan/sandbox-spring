package com.example.demo.webRoute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRouteTableRepository extends JpaRepository<WebRouteTable, Long> {
}
