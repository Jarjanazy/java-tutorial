package unitTestTutorial;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
public class Shipment {
   List<ShipmentDetail> shipmentDetailList = new ArrayList<>();
   private final String owner;
}
