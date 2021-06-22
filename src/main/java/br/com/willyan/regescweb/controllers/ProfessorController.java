package br.com.willyan.regescweb.controllers;

import br.com.willyan.regescweb.models.Professor;
import br.com.willyan.regescweb.models.StatusProfessor;
import br.com.willyan.regescweb.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;


    //Listagem de professores
    @GetMapping("professores")
    public ModelAndView index(){
        //FindAll vem do SpringData que já fornece uma busca dentro do banco
        List<Professor> professores = this.professorRepository.findAll() ;
        //Cria um modelo de dados para serem apresentados em uma data view
        ModelAndView mv = new ModelAndView("professores/index");
        mv.addObject("professores", professores);
        return mv;
    }

    @GetMapping("/professor/novo")
    public ModelAndView novoProfessor(){
        ModelAndView mv = new ModelAndView("professores/novo");
        //Passar status para a View
        mv.addObject("statusProfessor", StatusProfessor.values());
        return mv;
    }

    @PostMapping("/professores")
    public String criar(Professor professor){
        System.out.println(professor);

        return "redirect:/professores";
    }
}
