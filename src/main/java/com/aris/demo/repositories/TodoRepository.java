package com.aris.demo.repositories;

import com.aris.demo.entities.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author : Pallas
 * @project : demo-project
 * @created on : 28-April-2023
 * @email : talehji@gmail.com
 */

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAll();
}
