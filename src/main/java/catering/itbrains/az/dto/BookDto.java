package catering.itbrains.az.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
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
