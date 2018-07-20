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
public class ConvertResponse implements Serializable {

    private String disclaimer;

    private String license;

    private BigDecimal response;

    private MetaResponse meta;

    private ConvertRequest request;

    private String error;

}
