package catering.itbrains.az.services;
import catering.itbrains.az.dto.ViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ViewService {
    List<ViewDto> getAllViews();
}
