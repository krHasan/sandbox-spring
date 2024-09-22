package com.example.demo.dataSourceTwo.bloodGroup;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blood_group")
public class BloodGroup {

    @Id
    @GeneratedValue
    private Long id;
    private Long version;
    @Column(name = "group_name")
    private String groupName;
    private String description;

}
