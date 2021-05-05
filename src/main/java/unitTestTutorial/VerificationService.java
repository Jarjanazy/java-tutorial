package unitTestTutorial;

public class VerificationService {

    public boolean shipmentIsntValid(String owner, String productCode, int count) {
        return owner.isEmpty()
                || productCode.isEmpty()
                || count < 0;
    }
}
