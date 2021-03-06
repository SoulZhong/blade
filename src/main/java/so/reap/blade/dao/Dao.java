package so.reap.blade.dao;

import java.util.List;

import so.reap.blade.entity.Entity;


public interface Dao<T extends Entity, I>
{

	List<T> findAll();


	T find(I id);


	T save(T newsEntry);


	void delete(I id);

}