package cib.eureka.forexapp.web;

import cib.eureka.forexapp.model.RateResponse;
import cib.eureka.forexapp.srvc.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate")
public class RateController {

    @Autowired
    private RateService service;

    @GetMapping(value = "/{base}/{to}", produces = {"application/json"})
    public ResponseEntity<RateResponse> get(@PathVariable("base") String base, @PathVariable("to") String to) {
        return ResponseEntity.ok(service.rate(base, to));
    }

}
