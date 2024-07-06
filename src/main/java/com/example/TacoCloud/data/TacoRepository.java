package com.example.TacoCloud.data;

import com.example.TacoCloud.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
