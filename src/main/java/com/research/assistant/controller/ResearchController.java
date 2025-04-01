package com.research.assistant.controller;

import com.research.assistant.model.ResearchRequest;
import com.research.assistant.service.ResearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*")
public class ResearchController {

    private ResearchService service;

    @Autowired
    public ResearchController(ResearchService service) {
        this.service = service;
    }

    @PostMapping("/process")
    public ResponseEntity<String>processContent(@RequestBody ResearchRequest request)
    {
        return new ResponseEntity<>(service.processContent(request), HttpStatus.OK);
    }
}
