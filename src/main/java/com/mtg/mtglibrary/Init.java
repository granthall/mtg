package com.mtg.mtglibrary;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.mtg.mtglibrary.models.Cards;

@Configuration
public class Init {
	
	public static List<Cards> cards;

	@PostConstruct
	public void init() throws IOException, URISyntaxException {
		Gson gson = new Gson();
		String content = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("cardDatabase.json").toURI())));
		cards = Arrays.asList(gson.fromJson(content, Cards[].class));
	}
}
