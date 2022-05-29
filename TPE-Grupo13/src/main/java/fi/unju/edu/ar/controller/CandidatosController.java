package fi.unju.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.util.ListaCandidatos;


@Controller
@RequestMapping("/pci")
public class CandidatosController {
	

	@GetMapping("/candidatos")
    public String getCandidatosPage(Model model) {
        return "candidatos";
    }
	
	@GetMapping("/listaC")
    public ModelAndView getListaCandidatos(){
        ModelAndView movCandidatos = new ModelAndView("listaC");
        ListaCandidatos listaCandidatos = new ListaCandidatos();
        movCandidatos.addObject("candidatos",listaCandidatos.getCandidatos());
        return movCandidatos;
    }
}
