package com.example.NbaApi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NbaController {

    private final NbaService nbaService;

    public NbaController(NbaService nbaService) {
        this.nbaService = nbaService;
    }

    @GetMapping("/teams")
    public String getTeamsNba(Model model) {
        NbaResponse nbaResponse = nbaService.getTeamsNba();
        model.addAttribute("teams", nbaResponse);
        return "teams";
    }
}
