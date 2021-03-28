package lombokTurorial.withLombok;

import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder @ToString
public class Human {
    @Setter(AccessLevel.NONE)
    private int id;
    private String name;
    private int ageInYears;
}
