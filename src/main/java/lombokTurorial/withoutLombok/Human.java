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

    @Override
    public String toString(){
        return String.format("Id: %s, name: %s, age in years: %s",
                this.id, this.name, this.ageInYears);
    }

    @Override
    public boolean equals(Object other){
        if (other == null) return false;
        if (!(other instanceof Human)) return false;

        Human otherHuman = (Human) other;
        return this.name.equals(otherHuman.getName()) && this.ageInYears == otherHuman.getAgeInYears();
    }
}
