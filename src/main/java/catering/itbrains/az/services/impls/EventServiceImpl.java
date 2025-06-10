package catering.itbrains.az.services.impls;

import catering.itbrains.az.repository.EventRepository;
import catering.itbrains.az.services.EventService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final ModelMapper modelMapper;

    public EventServiceImpl(EventRepository eventRepository, ModelMapper modelMapper) {
        this.eventRepository = eventRepository;
        this.modelMapper = modelMapper;
    }
}
