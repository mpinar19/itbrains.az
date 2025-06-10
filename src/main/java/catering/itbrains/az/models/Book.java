package catering.itbrains.az.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String selectCountry;
    private String event;
    private String contact;
    private String dependCountry;
    private String place;
    private String vegetarian;
    private String email;
    private LocalDateTime Date;
}
