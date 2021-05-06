package unitTestTutorial;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ShipmentService {
    private final VerificationService verificationService;
    private final ShipmentRepository shipmentRepository;

    public String createAndSaveShipment(String owner, String productCode, int count){
        if (verificationService.shipmentIsntValid(owner, productCode, count))
            return "Shipment isn't valid";

        if (shipmentExistInDB(owner, productCode))
            return "Shipment Not Found";

        createNewShipment(owner, productCode, count);

        return "Shipment Is Created";
    }

    private void createNewShipment(String owner, String productCode, int count) {
        Shipment shipment = new Shipment(owner, productCode, count);
        shipmentRepository.save(shipment);
    }

    public boolean shipmentExistInDB(String owner, String productCode) {
        return shipmentRepository.findShipment(owner, productCode).isPresent();
    }

}
