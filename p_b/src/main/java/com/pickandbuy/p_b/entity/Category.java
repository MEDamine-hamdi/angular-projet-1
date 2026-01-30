package com.pickandbuy.p_b.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idc")
    private long idc;

    @Column(name = "namec")
    private String namec;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private Set<Produit> Produit;
}
