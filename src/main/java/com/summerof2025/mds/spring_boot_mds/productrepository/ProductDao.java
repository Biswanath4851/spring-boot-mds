package com.summerof2025.mds.spring_boot_mds.productrepository;

import com.summerof2025.mds.spring_boot_mds.productentity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
