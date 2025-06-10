package catering.itbrains.az.services;

import catering.itbrains.az.dto.CaterDto;
import catering.itbrains.az.dto.OurDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OurService {
    List<OurDto> getAllOurs();

}
