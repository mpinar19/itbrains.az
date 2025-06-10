package catering.itbrains.az.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AboutDto {
    private Long id;
    private String title;
    private String subTitle;
    private String photoUrl;
    private String information;
}
