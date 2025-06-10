package catering.itbrains.az.services;

import catering.itbrains.az.dto.AboutDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AboutService {
    List<AboutDto> getAllAbouts();
}
