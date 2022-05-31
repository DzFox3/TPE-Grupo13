package fi.unju.edu.ar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import fi.unju.edu.ar.model.Usuario;
import fi.unju.edu.ar.util.ListaCandidato;


@Controller
@RequestMapping("/pci")
public class IndexController {
	
    
    @GetMapping("/nuevo")
    public String getFormNewCursoPage(Model model) {
        model.addAttribute("usuario", new Usuario());
        ListaCandidato listaCandidato = new ListaCandidato();
        model.addAttribute("candidatos", listaCandidato.getCandidato());
        return "nuevousuario";
    }
	
	@GetMapping("/inicio")
    public String getInicioPage(Model model) {
        return "index";
    }

}
