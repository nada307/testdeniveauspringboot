package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Todo;



public interface ItodoService {
	public void ajouter (Todo todo) ;
	List<Todo> Lister();
	Todo afficher (Long idtodo);
	public void Update(Long id,Todo todo);


}
