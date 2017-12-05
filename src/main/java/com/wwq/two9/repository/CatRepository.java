package com.wwq.two9.repository;

import com.wwq.two9.bean.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository -- 是接口 ，不是class.
 * @author Angel -- 守护天使
 * @version v.0.1
 * @date 2016年12月18日
 */
public interface CatRepository extends CrudRepository<Cat, Integer>{

}
