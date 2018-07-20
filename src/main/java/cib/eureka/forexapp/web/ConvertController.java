package cib.eureka.forexapp.web;

import cib.eureka.forexapp.model.ConvertResponse;
import cib.eureka.forexapp.srvc.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/convert")
public class ConvertController {

    @Autowired
    private ConvertService service;

    @PostMapping(value = "/{amount}/{from}/{to}", produces = {"application/json"})
    public ResponseEntity<ConvertResponse> get(@PathVariable("amount") BigDecimal amount, @PathVariable("from") String from, @PathVariable("to") String to) {
        return ResponseEntity.ok(service.convert(amount, from, to));
    }

}
