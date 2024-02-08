package anish.spring.springjokes.controller;

import anish.spring.springjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    private final JokeService jokeService;







    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }

}
