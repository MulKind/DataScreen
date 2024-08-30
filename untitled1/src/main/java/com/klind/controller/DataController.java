package com.klind.controller;


import com.klind.entity.data;
import com.klind.service.DataService;
import jakarta.annotation.Resource;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"*", "null"})
@RestController
@RequestMapping("/data")
public class DataController {
    @Resource
    DataService dataService;

    @RequestMapping("/getdata")
    public List<data> getData(){
        List<data> list = dataService.getData();
        List<Map<Float, String>> map = new ArrayList<>();
        int i = 0;
        for(data d : list){
            Map<Float, String> m = new HashMap<>();
            m.put(d.getDatetime(),d.getTweets_sentiment_score());
            map.add(Map<d.getDatetime(),d.getTweets_sentiment_score());
        }
    }
}
