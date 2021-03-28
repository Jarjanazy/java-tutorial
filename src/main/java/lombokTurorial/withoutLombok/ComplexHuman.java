package lombokTurorial.withoutLombok;

public class ComplexHuman {
    private String complexThing;

    public String getComplexThing() {
        try {
            if (this.complexThing == null){
                // complex calculation
                Thread.sleep(3000);
                this.complexThing = "complex string";
            }
            return this.complexThing;
        }catch (Exception e){
            return "";
        }
    }
}
