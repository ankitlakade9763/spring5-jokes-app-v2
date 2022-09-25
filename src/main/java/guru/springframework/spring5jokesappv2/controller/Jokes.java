package guru.springframework.spring5jokesappv2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappv2.service.JokeService;

@Controller
public class Jokes {
	
	private final JokeService jokeService;
	@Autowired
	public Jokes(JokeService Quotes) {
		this.jokeService=Quotes;
	}

	@RequestMapping("/jokes")
	public String getQuotes(Model model) {
		model.addAttribute("joke",jokeService.getJokes());
		
		return "jokes/index";
	}
	
	public String getQuotes() {
		return jokeService.getJokes();
	}

}
