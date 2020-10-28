package io.java.coronavirustracker.controllers;

import io.java.coronavirustracker.models.LocationStats;
import io.java.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller// Spring Controller HTML UI
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")// root // thymeleaf
    public String home(Model model) {// with 'MODEL' i will acess in everything in the HTML
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();

        model.addAttribute("locationStats", allStats); // set attribute
        model.addAttribute("totalReportedCases", totalReportedCases); // set attribute
        model.addAttribute("totalNewCases", totalNewCases); // set attribute

        return "home";
    }
}
