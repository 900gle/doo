package com.bbongdoo.doo.controller;


import com.bbongdoo.doo.service.IndexService;
import com.bbongdoo.doo.service.LocationService;
import com.bbongdoo.doo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("indexer")
public class TestRestController {

    @Autowired
    TestService indexService;




    @CrossOrigin("*")
    @PostMapping("test/product")
    public void staticIndex() {
        indexService.staticIndex();
    }


}
