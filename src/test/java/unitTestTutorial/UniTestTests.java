package unitTestTutorial;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class UniTestTests {

    @Mock
    ShipmentRepository shipmentRepo;

    @Test
    public void givenShipmentData_CreateNewShipment(){
        VerificationService verificationService = new VerificationService();
        ShipmentService shipmentService = new ShipmentService(verificationService, shipmentRepo);

        doReturn(Optional.empty()).when(shipmentRepo).findShipment("jalil", "3HXX");
        doNothing().when(shipmentRepo).save(any());

        String result = shipmentService.createAndSaveShipment("jalil", "3HXX", 10);
        assertEquals("Shipment Is Created", result);
    }

    @Test
    public void givenData_DetectValidity(){
        VerificationService verificationService = new VerificationService();
        boolean result = verificationService.shipmentIsntValid("jhon", "3HFF", 2);
        assertFalse(result);
    }

    @Test
    public void givenData_DetectShipmentExistsInDB(){
        ShipmentService shipmentService = new ShipmentService(new VerificationService(), shipmentRepo);
        Shipment shipment = new Shipment("ahmed", "3HKK", 4);
        doReturn(Optional.of(shipment)).when(shipmentRepo).findShipment("ahmed", "3HKK");

        boolean result = shipmentService.shipmentExistInDB("ahmed", "3HKK");
        assertTrue(result);
    }


}
