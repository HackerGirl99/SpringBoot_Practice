package lk.ac.vau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lk.ac.vau.repo.GenericRepo;

import jakarta.persistence.EntityNotFoundException;

public abstract class GenericService<T, K> {
	@Autowired
	private GenericRepo<T, K> repo;

	public List<T> getAll() {
		return repo.findAll();
	}

	public T getById(K id) {
		if (repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("There is no entity with the Id " + id);
		}
		return repo.findById(id).get();
	}

	public T add(T t) {
		return repo.save(t);
	}

	public T update(K id, T t) {
		if (repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException(
					"There is no " + t.getClass().getSimpleName() + " with the Id " + id + " to update.");
		}
		return repo.save(t);
	}

	public void delete(K id) {
		if (repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("There is no " + repo.findById(id).get().getClass().getSimpleName()
					+ " with the Id " + id + " to delete.");
		}
		repo.deleteById(id);
	}

}
