package ro.iteahome.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.iteahome.mvc.model.form.PersonForm;

import javax.validation.Valid;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @GetMapping("/form")
    public String showForm(PersonForm personForm) {
        return "form";
    }

    @PostMapping("/new-person")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "form";
        } else {
            return "redirect:/results";
        }
    }
}
