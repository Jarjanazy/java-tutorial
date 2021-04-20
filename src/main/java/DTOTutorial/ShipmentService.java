package DTOTutorial;

import java.util.List;
import java.util.stream.Collectors;

public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public Shipment_UserDTO getShipment_ForUser(Integer id){
        return shipmentRepository.
                getShipmentById(id).
                map(this::getShipment_UserDTO_FromShipment).
                orElseThrow(() -> new RuntimeException("Shipment Not Found"));
    }

    public Shipment_AdminDTO getShipment_ForAdmin(Integer id){
        return shipmentRepository.
                getShipmentById(id).
                map(this::getShipment_AdminDTO_FromShipment).
                orElseThrow(() -> new RuntimeException("Shipment Not Found"));
    }

    public Shipments_AdminDTO getShipments_ForAdmin(){
        List<Shipment_AdminDTO> shipment_adminDTOS =
                shipmentRepository.
                getAllShipments().
                stream().
                map(this::getShipment_AdminDTO_FromShipment).
                collect(Collectors.toList());

        return new Shipments_AdminDTO(shipment_adminDTOS);
    }


    private Shipment_UserDTO getShipment_UserDTO_FromShipment(Shipment s){
        return new Shipment_UserDTO(s.getShipmentDate(), s.getProductCode(), s.getOwner());
    }

    private Shipment_AdminDTO getShipment_AdminDTO_FromShipment(Shipment s){
        return new Shipment_AdminDTO(s.getId(), s.getProductCode(), s.getOwner());
    }

}
