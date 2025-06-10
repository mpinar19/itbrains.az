package catering.itbrains.az.services.impls;

import catering.itbrains.az.dto.AboutDto;
import catering.itbrains.az.dto.CaterDto;
import catering.itbrains.az.models.About;
import catering.itbrains.az.models.Cater;
import catering.itbrains.az.repository.AboutRepository;
import catering.itbrains.az.services.AboutService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class AboutServiceImpl implements AboutService {
    private final AboutRepository aboutRepository;
    private final ModelMapper modelMapper;
public AboutServiceImpl(AboutRepository aboutRepository, ModelMapper modelMapper) {
        this.aboutRepository = aboutRepository;
    this.modelMapper = modelMapper;
}

    @Override
    public List<AboutDto> getAllAbouts() {
    List<About> aboutList=aboutRepository.findAll();
        List<About> aboutDtoList=aboutRepository.findAll().stream().limit(1).collect(Collectors.toList());
        List<AboutDto> getAllAbouts =aboutDtoList.stream().map(about->modelMapper.map(about,AboutDto.class)).collect(Collectors.toList());
        return getAllAbouts;
    }
}