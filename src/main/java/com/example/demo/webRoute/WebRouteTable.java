package com.example.demo.webRoute;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "web_route_table")
public class WebRouteTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long version;
    @Column(name = "country_id")
    private Long countryId;
    @Column(name = "domain_status_id")
    private Long domainStatusId;
    private String routeip;
    private String port;
    @Column(name = "is_http")
    private boolean isHttp;

}
