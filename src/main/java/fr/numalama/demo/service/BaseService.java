package fr.numalama.demo.service;

import fr.numalama.demo.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {

    /**
     * NORMALY, SERVICES IS CONNECTED TO A DATABASE PART
     *
     * */


    /**
     *
     * Dependency injection
     *
     */

    private static final Logger logger = LoggerFactory.getLogger(BaseService.class);


    /*
     * @param inComingIdParameterFromGetRequest
     * @return
     */

    public String generateIDExample(int inComingIdParameterFromGetRequest){

        String messageJoke = "hello dante from services ";

        logger.info(messageJoke + inComingIdParameterFromGetRequest);

        return messageJoke + inComingIdParameterFromGetRequest;
    }
}
