import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // O puedes usar SINGLE_TABLE o TABLE_PER_CLASS
public abstract class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate dueDate;
    private boolean status;

    // Getters and setters
}