package com.summerof2025.mds.spring_boot_mds.productRepository;

import com.summerof2025.mds.spring_boot_mds.productEntity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
