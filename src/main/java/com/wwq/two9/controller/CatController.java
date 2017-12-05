package com.wwq.two9.controller;

import javax.annotation.Resource;

import com.wwq.two9.bean.Cat;
import com.wwq.two9.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save() {
        Cat cat = new Cat();
        cat.setCatName("jack");
        cat.setCatAge(3);
        catService.save(cat);
        return "save ok.";
    }

    @RequestMapping("/delete")
    public String delete() {
        catService.delete(1);
        return "delete ok";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }

    @RequestMapping("/findByCatName")
    public Cat findByCatName(String catName) {
        return catService.findByCatName(catName);
    }

    @RequestMapping("/findByCatName2")
    public Cat findByCatName2(String catName) {
        System.out.println("CatController.findByCatName2()");
        return catService.findByCatName2(catName);

    }

    @RequestMapping("/selectByCatName")
    public Cat selectByCatName(String catName) {
        return catService.selectByCatName(catName);
    }
}
