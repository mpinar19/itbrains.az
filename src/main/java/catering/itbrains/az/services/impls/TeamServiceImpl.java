package catering.itbrains.az.services.impls;

import catering.itbrains.az.dto.OurDto;
import catering.itbrains.az.dto.TeamDto;
import catering.itbrains.az.models.Our;
import catering.itbrains.az.models.Team;
import catering.itbrains.az.repository.TeamRepository;
import catering.itbrains.az.services.TeamService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class TeamServiceImpl implements TeamService {
    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;

    public TeamServiceImpl(TeamRepository teamRepository, ModelMapper modelMapper) {
        this.teamRepository = teamRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<TeamDto> getAllTeams() {
        List<Team> teamDtoList=teamRepository.findAll();
        List<TeamDto> getAllTeams =teamDtoList.stream().map(team->modelMapper.map(team,TeamDto.class)).collect(Collectors.toList());
        return getAllTeams;
    }
}
