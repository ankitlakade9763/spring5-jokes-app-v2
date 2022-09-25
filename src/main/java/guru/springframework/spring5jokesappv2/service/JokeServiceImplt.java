package guru.springframework.spring5jokesappv2.service;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImplt implements JokeService {
	
	public String getJokes() {
		ChuckNorrisQuotes j=new ChuckNorrisQuotes();
		return j.getRandomQuote();
	}

}
