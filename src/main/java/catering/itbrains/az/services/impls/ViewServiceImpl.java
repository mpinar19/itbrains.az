package catering.itbrains.az.services.impls;

import catering.itbrains.az.dto.AboutDto;
import catering.itbrains.az.dto.ViewDto;
import catering.itbrains.az.models.About;
import catering.itbrains.az.models.View;
import catering.itbrains.az.repository.ViewRepository;
import catering.itbrains.az.services.ViewService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ViewServiceImpl implements ViewService {
    private final ViewRepository viewRepository;
    private final ModelMapper modelMapper;

    public ViewServiceImpl(ViewRepository viewRepository, ModelMapper modelMapper) {
        this.viewRepository = viewRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ViewDto> getAllViews() {
            List<View> viewDtoList=viewRepository.findAll();
            List<ViewDto> getAllViews =viewDtoList.stream().map(view->modelMapper.map(view,ViewDto.class)).collect(Collectors.toList());
            return getAllViews;
    }
}
