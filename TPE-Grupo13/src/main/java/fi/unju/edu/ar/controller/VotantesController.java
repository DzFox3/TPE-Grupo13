package fi.unju.edu.ar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.util.ListaUsuario;


@Controller
@RequestMapping("/votantes")
public class VotantesController {
	
	
    
	
	@GetMapping("/listaV")
    public ModelAndView getListaCandidatos(){
        ModelAndView movVotantes = new ModelAndView("votantes");
        ListaUsuario listaUsuario = new ListaUsuario();
        movVotantes.addObject("votantes",listaUsuario.getUsuario());
        return movVotantes;
    }

}
