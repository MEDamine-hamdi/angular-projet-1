package com.pickandbuy.p_b.dao;

import com.pickandbuy.p_b.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "produit",path = "produit")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
