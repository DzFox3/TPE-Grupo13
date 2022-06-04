package fi.unju.edu.ar.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.service.ICandidatoService;

@Controller
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    @Qualifier("CandidatoServiceImpList")
    private ICandidatoService candidatoService;

    private static final Log LOGGER = LogFactory.getLog(CandidatoController.class);

    // @GetMapping("/listaC")
    // public String getInicioPage(Model model) {
    // return "candidatos";
    // }
    @PostMapping("/guardar")
    public ModelAndView guardarCandidato(@Validated @ModelAttribute("candidato") Candidato candidato,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            ModelAndView mav = new ModelAndView("nuevocandidato");
            mav.addObject("candidato", candidato);
            LOGGER.info("error al crear un nuevo candidato");
            return mav;
        }

        ModelAndView mov = new ModelAndView("gracias");

        if (candidatoService.saveCandidato(candidato)) {
            LOGGER.info("Se cargo candidato: " + candidato.getNombre());
        }
        return mov;

    }

    @GetMapping("/editar/{codigo}")
    public ModelAndView getEditCandidatoPage(@PathVariable(value = "codigo") int codigo) {
        ModelAndView mav = new ModelAndView("editar_candidato");
        Candidato candidato = candidatoService.findCandidato(codigo);
        mav.addObject("candidato", candidato);
        return mav;
    }

    @PostMapping("/modificar")
    public ModelAndView editarDatosCandidato(@Validated @ModelAttribute("candidato") Candidato candidato,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            LOGGER.info("ocurrio un error " + candidato);
            ModelAndView mav = new ModelAndView("editar_candidato");
            mav.addObject("candidato", candidato);
            return mav;
        }

        ModelAndView mav = new ModelAndView("redirect:/candidatos/listaC");
        candidatoService.modifyCandidato(candidato);
        LOGGER.info("guardado");
        return mav;

    }

    @GetMapping("/listaC")
    public ModelAndView getListaCandidatos() {
        ModelAndView movCandidatos = new ModelAndView("candidatos");
        movCandidatos.addObject("candidatos", candidatoService.getListaCandidato().getCandidato());
        return movCandidatos;
    }

    @GetMapping("/eliminar/{dni}")
    public ModelAndView deleteCandidato(@PathVariable("dni") int codigo) {
        ModelAndView movCandidatos = new ModelAndView("redirect:/candidatos/listaC");
        candidatoService.deleteCandidato(codigo);
        return movCandidatos;
    }
}
