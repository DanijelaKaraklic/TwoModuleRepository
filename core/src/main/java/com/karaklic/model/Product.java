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
@EqualsAndHashCode(exclude = "images")
@ToString(exclude = "images")
@Table(name = "product",schema = "product_db")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name  = "Name")
    private String name;

    @Column(name  = "Currency")
    private String currency;

    @Column(name  = "Latitude")
    private double latitude;

    @Column(name  = "Longitude")
    private double longitude;

    @Column(name  = "Phone")
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="AddressComponentsID",referencedColumnName = "ID")
    private AddressComponents addressComponents;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="SupplierID",referencedColumnName = "ID")
    private Supplier supplier;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private List<Image> images;
}
