package com.summerof2025.mds.spring_boot_mds.orderRepositoty;

import com.summerof2025.mds.spring_boot_mds.orderEntity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderDao extends CrudRepository<Order,Integer> {
}
