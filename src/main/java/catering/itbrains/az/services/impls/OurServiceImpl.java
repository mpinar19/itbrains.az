package catering.itbrains.az.services.impls;

import catering.itbrains.az.dto.CaterDto;
import catering.itbrains.az.dto.OurDto;
import catering.itbrains.az.dto.ViewDto;
import catering.itbrains.az.models.Our;
import catering.itbrains.az.models.View;
import catering.itbrains.az.repository.OurRepository;
import catering.itbrains.az.services.OurService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class OurServiceImpl implements OurService {
    private final OurRepository ourRepository;
    private final ModelMapper modelMapper;

    public OurServiceImpl(OurRepository ourRepository, ModelMapper modelMapper) {
        this.ourRepository = ourRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<OurDto> getAllOurs() {
        List<Our> ourDtoList=ourRepository.findAll();
        List<OurDto> getAllOurs =ourDtoList.stream().map(our->modelMapper.map(our,OurDto.class)).collect(Collectors.toList());
        return getAllOurs;
    }
}
