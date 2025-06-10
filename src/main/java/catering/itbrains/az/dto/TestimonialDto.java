package catering.itbrains.az.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestimonialDto {
    private Long id;
    private String title;
    private String personName;
    private String professions;
    private String comment;
}
