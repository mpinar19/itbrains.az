package catering.itbrains.az.services.impls;

import catering.itbrains.az.dto.CaterDto;
import catering.itbrains.az.models.Cater;
import catering.itbrains.az.repository.CaterRepository;
import catering.itbrains.az.services.CaterService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CaterServiceImpl implements CaterService {
    private final CaterRepository caterRepository;
    private final ModelMapper modelMapper;

    public CaterServiceImpl(CaterRepository caterRepository, ModelMapper modelMapper) {
        this.caterRepository = caterRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CaterDto> getAllCaters() {
        List<Cater> caterDtoList=caterRepository.findAll().stream().limit(1).collect(Collectors.toList());
        List<CaterDto> getAllCaters =caterDtoList.stream().map(cater->modelMapper.map(cater,CaterDto.class)).collect(Collectors.toList());
        return getAllCaters;
    }
}
