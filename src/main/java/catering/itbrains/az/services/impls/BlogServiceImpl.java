package catering.itbrains.az.services.impls;

import catering.itbrains.az.dto.BlogDto;
import catering.itbrains.az.dto.OurDto;
import catering.itbrains.az.models.Blog;
import catering.itbrains.az.models.Our;
import catering.itbrains.az.repository.BlogRepository;
import catering.itbrains.az.services.BlogService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;
    private final ModelMapper modelMapper;

    public BlogServiceImpl(BlogRepository blogRepository, ModelMapper modelMapper) {
        this.blogRepository = blogRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<BlogDto> getAllBlogs() {
        List<Blog> blogDtoList=blogRepository.findAll();
        List<BlogDto> getAllBlogs =blogDtoList.stream().map(blog->modelMapper.map(blog,BlogDto.class)).collect(Collectors.toList());
        return getAllBlogs;
    }
}
