package com.wwq.two7.repository;

import org.springframework.data.repository.CrudRepository;

import com.wwq.two7.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer> {

}
