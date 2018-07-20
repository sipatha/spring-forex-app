package cib.eureka.forexapp.srvc;

import cib.eureka.forexapp.model.RateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "forex-rate-service", path = "/forex-rate-service")
public interface RateClientService {

    @GetMapping("/rate/{base}/{to}")
    RateResponse getRate(@PathVariable("base") String base, @PathVariable("to") String to);

}
