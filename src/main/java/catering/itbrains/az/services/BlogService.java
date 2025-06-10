package catering.itbrains.az.services;

import catering.itbrains.az.dto.BlogDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {
    List<BlogDto> getAllBlogs();
}
