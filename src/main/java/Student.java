import lombok.*;

//@Getter @Setter
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Student {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String dontNeedGetterOrSetter;
    private Long Id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;


    public Student(@NonNull String firstName, @NonNull String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(@NonNull Long id) {
        Id = id;
    }
}
