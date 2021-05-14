package com.ramy.gatie.portfolio.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramy.gatie.portfolio.models.MySqlDataEntity;
import com.ramy.gatie.portfolio.models.dto.JsonDataDTO;
import com.ramy.gatie.portfolio.repository.MySqlRepository;
import com.ramy.gatie.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@Controller
public class PortfolioController {

private  String formData = "";
private final MySqlRepository mySqlRepository;
private final PortfolioService portfolioService;
private static final AtomicLong counter = new AtomicLong();

    @Autowired
    public PortfolioController(MySqlRepository mySqlRepository, PortfolioService portfolioService) {
        this.mySqlRepository = mySqlRepository;
        this.portfolioService = portfolioService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("dynamic_page")
    public String dynamicPage(){


        return "dynamic_page";
    }

    @PostMapping("/dynamic_page_json")
    public String dynamicPagePostMethodForJson(@RequestParam  String dataFromForm){
       formData = dataFromForm;
        return "redirect:/path_variable";
    }


    @RequestMapping(value="/path_variable", method = RequestMethod.GET)
    @ResponseBody
    public JsonDataDTO formDataInJson (){
        return new JsonDataDTO(counter.incrementAndGet(), String.format(getFormData()));
    }



    @RequestMapping(value="/save_data", method = RequestMethod.POST)
    @ResponseBody
    public String dynamicPagePostMethodForMySql(@RequestParam String name, @RequestParam String fav_pokemon) throws JsonProcessingException {

        MySqlDataEntity mySqlDataEntity = new MySqlDataEntity(name, fav_pokemon);
        portfolioService.SaveDataToDatabase(mySqlDataEntity);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(portfolioService.RetrieveDataFromDatabase(name));

        return jsonString;
    }


    public  String getFormData() {
        return formData;
    }

}
