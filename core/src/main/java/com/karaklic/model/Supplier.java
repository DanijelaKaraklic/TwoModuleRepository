package com.karaklic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor

@Table(name = "supplier",schema = "product_db")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "TaxNumber")
    private String taxNumber;

    @Column(name = "EmailAddress")
    private String emailAdress;

    @Column(name = "WebAddress")
    private String webAddress;

    @Column(name = "DayPhone")
    private String dayPhone;

    @Column(name = "MobilePhone")
    private String mobilePhone;

}
