package lombokTurorial.withoutLombok;

public class Human {
    private final int id;
    private String name;
    private int ageInYears;

    public Human(int id) {
        this.id = id;
    }

    public Human(int id, String name, int ageInYears) {
        this.id = id;
        this.name = name;
        this.ageInYears = ageInYears;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAgeInYears() {
        return ageInYears;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public Human name(String name){
        this.name = name;
        return this;
    }
    public Human ageInYears(int ageInYears){
        this.ageInYears = ageInYears;
        return this;
    }

}
