package catering.itbrains.az.services.impls;

import catering.itbrains.az.repository.MenuRepository;
import catering.itbrains.az.services.MenuService;
import org.modelmapper.ModelMapper;

public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;
    private final ModelMapper modelMapper;

    public MenuServiceImpl(MenuRepository menuRepository, ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
    }
}
