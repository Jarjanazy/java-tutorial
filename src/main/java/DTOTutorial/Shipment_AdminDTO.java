package DTOTutorial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder @AllArgsConstructor
public class Shipment_AdminDTO {
    private Integer id;
    private String productCode;
    private String serialNumber;
}
