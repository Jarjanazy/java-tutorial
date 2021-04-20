package DTOTutorial;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

// those are only mock methods
public class ShipmentRepository {
    private final List<Shipment> shipments;

    public ShipmentRepository() {
        this.shipments = Arrays.asList(
                new Shipment(1, new Date(), "3XX", "jalil", "ZZZ"),
                new Shipment(2, new Date(), "3VV", "Ahmet", "JJJ"));
    }

    public Optional<Shipment> getShipmentById(Integer id){
        return shipments.
                stream().
                filter(s -> s.getId().equals(id)).
                findAny();
    }

    public List<Shipment> getAllShipments(){
        return this.shipments;
    }

}
