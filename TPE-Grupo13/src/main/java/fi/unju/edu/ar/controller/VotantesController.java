package fi.unju.edu.ar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/votantes")
public class VotantesController {
	
	
	
	@GetMapping("/listaV")
    public String getVotantesPage(Model model) {
        return "votantes";
    }

}
