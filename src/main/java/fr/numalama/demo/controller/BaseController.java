package fr.numalama.demo.controller;


import fr.numalama.demo.model.Example;
import fr.numalama.demo.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * WHEN YOU CREATED A CONTROLLER WITH SPRING, YOU NEED TO DEFINED THE CLASS WITH
 * @RestController
 */
@RestController

/**
 * @RequestMapping
 * ALL the controller into this class, is mapped to /base
 */
@RequestMapping("base/")
public class BaseController {


    /**
     *
     * Dependency injection
     *
     */
    @Autowired
    private BaseService baseService;

    /**
     * LET'S INTRODUCE, THE SERVICES NO ? ( THE WORK SIDE )
     */

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * WHEN USING A GET MAPPING, DATAS ARE PUSH THROUGHT URL (so we use @PathVariable)
     * example url: localhost:8080/base/get/{id}
     */
    @GetMapping(value = "get/{id}", produces = "application/json")
    public String getTest(@PathVariable int id){
        // System.out.println("id : " + id);
        logger.info("id: " + id);
        return this.baseService.generateIDExample(id);
    }

    /**
     * WHEN USING A POST MAPPING, DATAS ARE PUSH THROUGHT BODY OF THE REQUEST (so we use @RequestBody)
     * example url: localhost:8080/base/post/
     *
     * JSONify the object into a json
     * so Example => Example json object
     */
    @PostMapping(value = "post/", produces = "application/json")
    public void getTestPost(@RequestBody Example example){
        // System.out.println("id : " + id);
//        /logger.info("id: " + example.getId());

        //return this.baseService.generateIDExample(id);
    }

    /**
     * others example
     *
     * @PutMapping
     * @DeleteMapping
     * ...
     */

    /**
     * @RequestMapping ACCEPT ALL (GET/POST/PUT/DELETE...)
     *
     * MORE SIMPLE WHEN YOU START
     */
    @RequestMapping(value = "/", produces = "application/json")
    public String getTestall(@RequestBody int id){
        // System.out.println("id : " + id);
        logger.info("id: " + id);

        return this.baseService.generateIDExample(id);
    }




}