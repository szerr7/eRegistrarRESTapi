package edu.miu.cs.cs425.eregistrar.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId ;

    @Column(unique = true, nullable = false)
    private String studentNumber ;

    @Column(nullable = false)
    private String firstName ;

    private String middleName ;

    @Column(nullable = false)
    private String lastName ;

    private float cgpa ;

    @DateTimeFormat(pattern = "yyyy-M-dd")
    private LocalDate enrollmentDate ;

    @Column(nullable = false)
    private boolean isInternational ;

}
