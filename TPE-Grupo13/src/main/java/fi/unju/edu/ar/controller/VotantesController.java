package fi.unju.edu.ar.controller;


import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.model.Usuario;
import fi.unju.edu.ar.util.ListaCandidato;
import fi.unju.edu.ar.util.ListaUsuario;


@Controller
@RequestMapping("/votantes")
public class VotantesController {
	
	
    private static final Log LOGGER = LogFactory.getLog(IndexController.class);
    
    ListaUsuario listaUsuario = new ListaUsuario();
	
    

    @PostMapping("/guardar")
    public ModelAndView guardarCurso(  @Validated @ModelAttribute("usuario") Usuario usuario,BindingResult bindingResult  ) {
        
    	if (bindingResult.hasErrors()) {
            ModelAndView mav = new ModelAndView("nuevousuario");
            mav.addObject("usuario", usuario);
            return mav;
        }
    
        ModelAndView mov = new ModelAndView("gracias");
        ListaCandidato listaCandidato = new ListaCandidato();
        Optional<Candidato> candidato = listaCandidato.getCandidato().stream().filter(d -> d.getCodigo() == usuario.getCandidato().getCodigo()).findFirst();
        usuario.setCandidato(candidato.get());
        if (listaUsuario.getUsuario().add(usuario)) {
            LOGGER.info("Se guardo un objeto usuario en la lista de usuario");
        }
        mov.addObject("candidatos", listaCandidato.getCandidato());
        return mov;
        
    }


	
	@GetMapping("/listaV")
    public ModelAndView getListaCandidatos(){
        ModelAndView movVotantes = new ModelAndView("votantes");
        movVotantes.addObject("votantes",listaUsuario.getUsuario());
        return movVotantes;
    }

}
