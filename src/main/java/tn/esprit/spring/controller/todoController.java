package tn.esprit.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Todo;
import tn.esprit.spring.repository.todoRepository;
import tn.esprit.spring.service.ItodoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class todoController {
	@Autowired
	ItodoService ts;
	@Autowired
	todoRepository tr;
	@PostMapping("/addTodo")
	public void AjouterDimensionnement(@RequestBody Todo todo) {
		ts.ajouter(todo);;
	}
	@GetMapping("/getAllT")
	public List<Todo>  listerTodo() {
		List<Todo> list= ts.Lister();
				return list;
	}
	
	@GetMapping("/getOneTodo/{id}")
	public Todo afficherTodo(@PathVariable Long id) {
		return ts.afficher(id);
	}
	
	@PutMapping("/Todo/{id}")
	public ResponseEntity<Object> updateDimensionnement(@PathVariable long id, @RequestBody Todo todo) {

		Optional<Todo> TodoOptional = tr.findById(id);

		if (!TodoOptional.isPresent())
			return ResponseEntity.notFound().build();

		todo.setId(id);
		
		tr.save(todo);

		return ResponseEntity.noContent().build();
	}
	
	
	
}
