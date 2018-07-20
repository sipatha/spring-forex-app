package cib.eureka.forexapp.srvc;

import cib.eureka.forexapp.model.RateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateService {

    @Autowired
    private RateClientService service;

    public RateResponse rate(String base, String to) {
        if(to.equalsIgnoreCase(base)) {
            return RateResponse.builder().error("To and Base currencies should be different").build();
        }

        try {
            return service.getRate(base, to);
        } catch (Exception e) {
            return RateResponse.builder().error("Error: " + e.getMessage()).build();
        }
    }

}
