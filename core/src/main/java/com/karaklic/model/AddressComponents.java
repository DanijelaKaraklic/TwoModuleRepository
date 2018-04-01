package com.karaklic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "products")
@ToString(exclude = "products")
@Table(name = "address_components",schema = "product_db")
public class AddressComponents {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "PostalCode")
    private String postalCode;

    @Column(name = "Country")
    private String country;

    @Column(name = "Region")
    private String region;

    @Column(name = "City")
    private String city;

    @Column(name = "Street")
    private String street;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Product> products;
}
