package com.example.tareagtics.Controllers;

import com.example.tareagtics.Models.Entities.Categoria;
import com.example.tareagtics.Models.Entities.Employee;
import com.example.tareagtics.Models.Entities.Job;
import com.example.tareagtics.Models.Entities.Receta;
import com.example.tareagtics.Models.Repositories.CategoriaRepository;
import com.example.tareagtics.Models.Repositories.RecetaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/receta")
public class RecetaController {

    final CategoriaRepository categoriaRepository;
    final RecetaRepository recetaRepository;

    public RecetaController(CategoriaRepository categoriaRepository, RecetaRepository recetaRepository) {
        this.categoriaRepository = categoriaRepository;
        this.recetaRepository = recetaRepository;
    }


    @GetMapping("/listar")
    public String showRecetas(Model model) {
        List<Receta> listaReceta = recetaRepository.findAll();
        model.addAttribute("lista", listaReceta);
        return "listaRecetas";
    }


    @GetMapping("/editar")
    public String editarReceta(Model model,
                                  @RequestParam("idReceta") int id) {
        List<Categoria> listaCategoria = categoriaRepository.findAll();
        model.addAttribute("lista", listaCategoria);
        Optional<Receta> optionalReceta = recetaRepository.findById(id);

        if(optionalReceta.isPresent()) {
            Receta receta = optionalReceta.get();
            model.addAttribute("receta", receta);
            return "formulario1";
        }else{
            return "redirect:/employee/listar";
        }
    }

    @PostMapping("/guardar")
    public String guardarReceta(Receta receta) {
        recetaRepository.save(receta);
        return "redirect:/receta/listar";
    }

    @GetMapping("/borrar")
    public String borrarReceta(Model model, @RequestParam("idReceta") int id, RedirectAttributes redirectAttributes) {
        try {
            recetaRepository.deleteById(id);
            redirectAttributes.addFlashAttribute("mensaje", "Se borró la receta");
            redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("mensaje", "No se pudo borrar la receta");
            redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
        }
        return "redirect:/receta/listar";
    }

    @GetMapping("agregar")
    public String AgregarReceta(Model model) {
        List<Categoria> listaCategoria = categoriaRepository.findAll();
        model.addAttribute("lista", listaCategoria);
        return "formulario1Crear";
    }




}
