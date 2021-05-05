package unitTestTutorial;

import lombok.RequiredArgsConstructor;
import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
public class Shipment {
   private final String productCode;
   private final String owner;
   private final int count;
}
