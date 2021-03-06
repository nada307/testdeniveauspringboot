package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Todo;

@Repository
public interface todoRepository extends CrudRepository <Todo,Long> {

}
