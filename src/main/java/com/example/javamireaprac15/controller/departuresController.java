package com.example.javamireaprac15.controller;

import com.example.javamireaprac15.model.Departure;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/departures")
public class departuresController {

    private final List<Departure> departureList = new ArrayList<Departure>(
            Collections.singletonList(new Departure("Type1", "55.30.30")));

    @GetMapping
    public String index(Model model) {
        model.addAttribute("departures", departureList);
        return "departures/index.html";
    }

    @PostMapping
    public String create(@ModelAttribute("departure") Departure departure) {
        departureList.add(departure);
        return "redirect:/departures";
    }

    @GetMapping("/new")
    public String newDeparture(@ModelAttribute("departure") Departure departure) {
        return "departures/new.html";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        departureList.removeIf(departure -> departure.getId() == id);
        return "redirect:/departures";
    }
}
