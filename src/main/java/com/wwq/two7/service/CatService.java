package com.wwq.two7.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import com.wwq.two7.bean.Cat;
import com.wwq.two7.repository.CatRepository;
import org.springframework.stereotype.Service;

@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    /**
     * save,update ,delete 方法需要绑定事务.
     * <p>
     * 使用@Transactional进行事务的绑定.
     *
     * @param cat
     */

    //保存数据.
    @Transactional
    public void save(Cat cat) {
        catRepository.save(cat);
    }

    //删除数据》
    @Transactional
    public void delete(int id) {
        catRepository.delete(id);
    }

    //查询数据.
    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }

}
