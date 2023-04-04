package com.example.javamireaprac15.controller;

import com.example.javamireaprac15.model.PostOffice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/postoffices")
public class postOfficesController {

    private final List<PostOffice> postOfficeList = new ArrayList<PostOffice>(
            Collections.singletonList(new PostOffice("PO1", "Moscow")));

    @GetMapping
    public String index(Model model) {
        model.addAttribute("postoffices", postOfficeList);
        return "postoffices/index.html";
    }

    @PostMapping
    public String create(@ModelAttribute("postoffice") PostOffice postOffice) {
        postOfficeList.add(postOffice);
        return "redirect:/postoffices";
    }

    @GetMapping("/new")
    public String newDeparture(@ModelAttribute("postoffice") PostOffice postOffice) {
        return "postoffices/new.html";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        postOfficeList.removeIf(postOffice -> postOffice.getId() == id);
        return "redirect:/postoffices";
    }
}

