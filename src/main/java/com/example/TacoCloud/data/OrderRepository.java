package com.example.TacoCloud.data;

import com.example.TacoCloud.TacoOrder;
import com.example.TacoCloud.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);
}
