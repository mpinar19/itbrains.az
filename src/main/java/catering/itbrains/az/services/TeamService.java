package catering.itbrains.az.services;

import catering.itbrains.az.dto.TeamDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamService {
    List<TeamDto> getAllTeams();
}
