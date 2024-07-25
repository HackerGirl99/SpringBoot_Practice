package lk.vau.fas.dps.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.vau.fas.dps.Repo.GenericRepo;

public class GenericService<T, K> {
	@Autowired
	private GenericRepo<T, K> repo;
	
	public List<T>getAll(){
		return repo.findAll();
	}
	
	public T getById(K id) {
		return repo.findById(id).get();
	}
	
	public String addEle(T ele) {
		repo.save(ele);
		return "Added Successfully";
	}
	
	public String updateEle(K id, T ele) {
		if(repo.findById(id).isEmpty()){
			return "Element not found";
		}
		repo.save(ele);
		return "Updated Successfully";
	} 
	
	public String deleteEle(K id) {
		if(repo.findById(id).isEmpty()){
			return "Element not found";
		}
		repo.delete(repo.findById(id).get());
		return "Deleted Successfully";
	} 
}
