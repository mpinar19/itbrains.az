package catering.itbrains.az.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OurDto {
    private Long id;
    private String photoUrl;
    private String title;
    private String subTitle;
}
