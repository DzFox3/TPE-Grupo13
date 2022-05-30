package fi.unju.edu.ar.controller;

import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
import fi.unju.edu.ar.service.ICadidatoService;
import fi.unju.edu.ar.util.ListaCandidato;

@Controller
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
	@Qualifier("CandidatoServiceImpList")
	private ICadidatoService candidatoService;

    private static final Log LOGGER = LogFactory.getLog(CandidatoController.class);

    // @GetMapping("/listaC")
    // public String getInicioPage(Model model) {
    // return "candidatos";
    // }

    @GetMapping("/editar/{codigo}")
    public ModelAndView getEditCandidatoPage(@PathVariable(value = "codigo") int codigo) {
        ModelAndView mav = new ModelAndView("editar_candidato");
        Candidato candidato = candidatoService.findCandidato(codigo);
        mav.addObject("candidato", candidato);
        return mav;
    }
    
    @PostMapping("/modificar")
	public ModelAndView editarDatosAlumno(@Validated @ModelAttribute("candidato") Candidato candidato, BindingResult bindingResult ) {
		if(bindingResult.hasErrors()) {
			LOGGER.info("ocurrió un error "+candidato);
			ModelAndView mav = new ModelAndView("edicion_candidato");
			mav.addObject("candidato", candidato);
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("redirect:/candidato/candidatos");
		candidatoService.modifyCandidato(candidato);
		return mav;
		
	}

    @GetMapping("/listaC")
    public ModelAndView getListaCandidatos() {
        ModelAndView movCandidatos = new ModelAndView("candidatos");
        ListaCandidato listaCandidatos = new ListaCandidato();
        movCandidatos.addObject("candidatos", listaCandidatos.getCandidato());
        return movCandidatos;
    }

}
