package org.oleg.bryl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.oleg.bryl.model.People;
import org.oleg.bryl.services.PeopleService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    PeopleService peopleService;

    @RequestMapping("/registry")
    public String registry(Model model) {
        People people = new People();
        model.addAttribute("people", people);

        return "registerPeople";
    }

    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public String registryPost(@Valid @ModelAttribute("people") People people, BindingResult result,
                               Model model, @AuthenticationPrincipal User user) {
        if(result.hasErrors()){
            return "registerPeople";
        }

        List<People> peopleList = peopleService.getAllPeoples();

        for (int i = 0; i< peopleList.size(); i++){
            if(people.getPeople_email().equals(peopleList.get(i).getPeople_email())){
                model.addAttribute("people_email", "This email is already registered.");

                return "registerPeople";
            }

            if(people.getPeople_username().equals(peopleList.get(i).getPeople_username())){
                model.addAttribute("people_username", "This username is already registered.");

                return "registerPeople";
            }
        }

        people.setEnabled(true);
        peopleService.addPeople(people);
        return "registerPeopleSuccess";
    }
}
