package cib.eureka.forexapp.srvc;

import cib.eureka.forexapp.model.ConvertResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConvertService {

    @Autowired
    private ConvertClientService service;

    public ConvertResponse convert(BigDecimal amount, String from, String to) {
        if(to.equalsIgnoreCase(from)) {
            return ConvertResponse.builder().error("To and From currencies should be different").build();
        }

        if(BigDecimal.ZERO.compareTo(amount) <= 0) {
            return ConvertResponse.builder().error("Amount should be more than 0").build();
        }

        try {
            return service.convert(amount, from, to);
        } catch (Exception e) {
            return ConvertResponse.builder().error("Error: " + e.getMessage()).build();
        }
    }

}
