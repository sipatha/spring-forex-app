package cib.eureka.forexapp.srvc;

import cib.eureka.forexapp.model.ConvertResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name = "forex-convert-service", path = "/forex-convert-service")
public interface ConvertClientService {

    @GetMapping("/convert/{amount}/{from}/{to}")
    ConvertResponse convert(@PathVariable("amount") BigDecimal amount, @PathVariable("from") String from, @PathVariable("to") String to);

}
