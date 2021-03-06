package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Todo;
import tn.esprit.spring.repository.todoRepository;
@Service
public class todoService implements ItodoService{
	@Autowired
	todoRepository tr;
	
	@Override
	public void ajouter(Todo todo) {
		// TODO Auto-generated method stub
		tr.save(todo);
	}

	@Override
	public List<Todo> Lister() {
		// TODO Auto-generated method stub
		return (List<Todo>)tr.findAll();	}

	@Override
	public Todo afficher(Long idtodo) {
		// TODO Auto-generated method stub
		return tr.findById(idtodo).orElse(null) ;
	}

	@Override
	public void Update(Long id, Todo todo) {
		// TODO Auto-generated method stub
		
	}
/*	public String CheckDate(Todo todo){
		 String a=todo.getDatededebut();			
		 String b=todo.getDatedecheance();
		
		 if(a>b){ return("false");}else{return("true");}
		}
*/
}
