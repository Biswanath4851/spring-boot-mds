package com.summerof2025.mds.spring_boot_mds.productrepository;

import com.summerof2025.mds.spring_boot_mds.productentity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends CrudRepository<Order,Integer> {
}
