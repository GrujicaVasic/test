package is.nutritivna_zona.models.entities;

import is.nutritivna_zona.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "measures")
public class MeasureEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @NotNull
    @Column(name = "waist_circumference", nullable = false, precision = 5, scale = 2)
    private BigDecimal waistCircumference;

    @NotNull
    @Column(name = "stomach_circumference", nullable = false, precision = 5, scale = 2)
    private BigDecimal stomachCircumference;

    @NotNull
    @Column(name = "hips_circumference", nullable = false, precision = 5, scale = 2)
    private BigDecimal hipsCircumference;

    @NotNull
    @Column(name = "height", nullable = false, precision = 5, scale = 2)
    private BigDecimal height;

    @NotNull
    @Column(name = "body_mass", nullable = false, precision = 5, scale = 2)
    private BigDecimal bodyMass;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private is.nutritivna_zona.models.entities.UserEntity user;

}