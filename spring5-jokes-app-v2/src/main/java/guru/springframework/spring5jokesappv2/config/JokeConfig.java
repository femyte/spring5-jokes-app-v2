package guru.springframework.spring5jokesappv2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import guru.springframework.spring5jokesappv2.services.JokeServiceImpl;

@Configuration
public class JokeConfig {
	

	
	@Bean
	JokeServiceImpl jokeServiceImple() {
		return new JokeServiceImpl(chuckNorrisQuotes());
	}
	
	@Bean
	ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

}
