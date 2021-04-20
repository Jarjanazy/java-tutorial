package DTOTutorial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @AllArgsConstructor
public class Shipments_AdminDTO {
    private final List<Shipment_AdminDTO> shipment_adminDTOs;
}
