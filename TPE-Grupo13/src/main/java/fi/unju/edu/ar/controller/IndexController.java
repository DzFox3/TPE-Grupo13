package fi.unju.edu.ar.controller;


import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.model.Usuario;
import fi.unju.edu.ar.util.ListaCandidato;
import fi.unju.edu.ar.util.ListaUsuario;


@Controller
@RequestMapping("/pci")
public class IndexController {
	
    private static final Log LOGGER = LogFactory.getLog(IndexController.class);
	
    @GetMapping("/nuevo")
    public String getFormNewCursoPage(Model model) {
        model.addAttribute("usuario", new Usuario());
        ListaCandidato listaCandidato = new ListaCandidato();
        model.addAttribute("candidatos", listaCandidato.getCandidato());
        return "nuevousuario";
    }

    @PostMapping("/guardar")
    public ModelAndView guardarCurso( @ModelAttribute("usuario") Usuario usuario) {
        ModelAndView mov = new ModelAndView("gracias");
        ListaUsuario listaUsuario = new ListaUsuario();
        ListaCandidato listaCandidato = new ListaCandidato();
        Optional<Candidato> candidato = listaCandidato.getCandidato().stream().filter(d -> d.getCodigo() == usuario.getCandidato().getCodigo()).findFirst();
        usuario.setCandidato(candidato.get());
        if (listaUsuario.getUsuario().add(usuario)) {
            LOGGER.info("Se guardo un objeto usuario en la lista de usuario");
        }
        mov.addObject("candidatos", listaCandidato.getCandidato());
        return mov;
    }

	
	@GetMapping("/inicio")
    public String getInicioPage(Model model) {
        return "index";
    }

}
