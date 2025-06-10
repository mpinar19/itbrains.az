package catering.itbrains.az.controller;

import catering.itbrains.az.dto.*;
import catering.itbrains.az.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final CaterService caterService;
    private final AboutService aboutService;
    private final ViewService viewService;
    private final OurService ourService;
    private final TeamService teamService;
    private final BlogService blogService;
    public HomeController(CaterService caterService, AboutService aboutService, ViewService viewService, OurService ourService, TeamService teamService, BlogService blogService) {

        this.caterService = caterService;
        this.aboutService = aboutService;
        this.viewService = viewService;
        this.ourService = ourService;
        this.teamService = teamService;
        this.blogService = blogService;
    }
    @GetMapping("/")
    public String index(Model model){
        List<CaterDto> findCater = caterService.getAllCaters();
        List<AboutDto> findAbout = aboutService.getAllAbouts();
        List<ViewDto> findView = viewService.getAllViews();
        List<OurDto> findOur = ourService.getAllOurs();
        List<TeamDto> findTeam= teamService.getAllTeams();
        List<BlogDto> findBlog = blogService.getAllBlogs();
        model.addAttribute("blogs",findBlog);
        model.addAttribute("teams",findTeam);
        model.addAttribute("ours",findOur);
        model.addAttribute("views",findView);
        model.addAttribute("abouts",findAbout);
        model.addAttribute("caters",findCater);
        return "index.html";
    }
    @GetMapping("/about")
    public String about(Model model){
        List<AboutDto> findAbout = aboutService.getAllAbouts();
        List<ViewDto> findView = viewService.getAllViews();
        List<TeamDto> findTeam= teamService.getAllTeams();
        model.addAttribute("teams",findTeam);
        model.addAttribute("views",findView);
        model.addAttribute("abouts",findAbout);
        return "about.html";
    }
    @GetMapping("/service")
    public String service(Model model){
        List<OurDto> findOur = ourService.getAllOurs();
        model.addAttribute("ours",findOur);
        return "service.html";
    }
    @GetMapping("/event")
    public String event(){
        return "event.html";
    }
    @GetMapping("/menu")
    public String menu(){
        return "menu.html";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }
    @GetMapping("/blog")
    public String blog(Model model){
        return "blog.html";
    }
    @GetMapping("/book")
    public String book(){
        return "book.html";
    }
    @GetMapping("/team")
    public String team(Model model){
        List<TeamDto> findTeam= teamService.getAllTeams();
        model.addAttribute("teams",findTeam);
        return "team.html";
    }
    @GetMapping("/testimonial")
    public String testimonial(){
        return "testimonial.html";
    }
}
