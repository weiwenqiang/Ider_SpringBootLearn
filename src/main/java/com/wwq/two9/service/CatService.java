package com.wwq.two9.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import com.wwq.two9.bean.Cat;
import com.wwq.two9.dao.CatDao;
import com.wwq.two9.repository.Cat2Repository;
import com.wwq.two9.repository.CatRepository;
import org.springframework.stereotype.Service;

@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Resource
    private Cat2Repository cat2Repository;

    @Resource
    private CatDao catDao;


    /**
     * save,update ,delete 方法需要绑定事务.
     *
     * 使用@Transactional进行事务的绑定.
     *
     * @param cat
     */

    //保存数据.
    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }

    //删除数据》
    @Transactional
    public void delete(int id){
        catRepository.delete(id);
    }

    //查询数据.
    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }


    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);
    }


    public Cat findByCatName2(String catName){
        return cat2Repository.findMyCatName(catName);
    }


    public Cat selectByCatName(String catName){
        return catDao.selectByCatName(catName);
    }
}