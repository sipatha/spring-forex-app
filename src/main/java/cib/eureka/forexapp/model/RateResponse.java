package cib.eureka.forexapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RateResponse implements Serializable {

    private String disclaimer;

    private String license;

    private Date timestamp;

    private Map<String, BigDecimal> rates;

    private String error;

}
