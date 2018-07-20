package cib.eureka.forexapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConvertRequest implements Serializable {

    private String query;

    private BigDecimal amount;

    private String from;

    private String to;

}
