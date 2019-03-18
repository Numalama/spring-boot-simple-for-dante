package fr.numalama.demo.controller;


import fr.numalama.demo.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("base")
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

    @GetMapping(value = "/{id}", produces = "application/json")
    public String getTest(@PathVariable int id){

        // System.out.println("id : " + id);
        logger.info("id: " + id);

        return this.baseService.generateIDExample(id);
    }

}