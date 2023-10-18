package kernel.hackerthon.library.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicUpdate
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar", length = 255)
    private String name;

    @Column(name="is_rental", columnDefinition = "varchar", length = 255)
    private Boolean isRental;

    @Column(name="is_recovery", columnDefinition = "varchar", length = 255)
    private Boolean isRecovery;

    @Builder
    public Book(Long id, String name, Boolean isRental, Boolean isRecovery) {
        this.id = id;
        this.name = name;
        this.isRental = isRental;
        this.isRecovery = isRecovery;
    }

    public void rentalByBook() {
        this.isRental = true;
    }
}
