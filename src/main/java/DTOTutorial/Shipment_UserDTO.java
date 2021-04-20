package DTOTutorial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @Builder @AllArgsConstructor
public class Shipment_UserDTO {
    private Date shipmentDate;
    private String productCode;
    private String owner;
}
