package fi.unju.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.util.ListaCandidato;


@Controller
@RequestMapping("/candidatos")
public class CandidatoController {
	
//	@GetMapping("/listaC")
//    public String getInicioPage(Model model) {
//        return "candidatos";
//    }
	
	
	@GetMapping("/listaC")
    public ModelAndView getListaCandidatos(){
        ModelAndView movCandidatos = new ModelAndView("candidatos");
        ListaCandidato listaCandidatos = new ListaCandidato();
        movCandidatos.addObject("candidatos",listaCandidatos.getCandidato());
        return movCandidatos;
    }
}
