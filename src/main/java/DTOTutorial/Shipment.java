package DTOTutorial;

import lombok.*;

import java.util.Date;

@Getter @Setter @Builder @AllArgsConstructor
public class Shipment {
    private Integer id;
    private Date shipmentDate;
    private String productCode;
    private String owner;
    private String serialNumber;
}
