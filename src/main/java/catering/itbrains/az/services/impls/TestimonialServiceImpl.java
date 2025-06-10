package catering.itbrains.az.services.impls;

import catering.itbrains.az.repository.TestimonialRepository;
import catering.itbrains.az.services.TestimonialService;
import org.modelmapper.ModelMapper;

public class TestimonialServiceImpl implements TestimonialService {
    private final TestimonialRepository testimonialRepository;
    private final ModelMapper modelMapper;

    public TestimonialServiceImpl(TestimonialRepository testimonialRepository, ModelMapper modelMapper) {
        this.testimonialRepository = testimonialRepository;
        this.modelMapper = modelMapper;
    }
}
