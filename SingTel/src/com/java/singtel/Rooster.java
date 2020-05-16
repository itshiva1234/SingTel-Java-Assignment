package com.java.singtel;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
	private static final Map<String, String> LanguageMapper;
	static {
		LanguageMapper = new HashMap<String, String>();
		LanguageMapper.put("English", "Cock-a-doodle-doo");
		LanguageMapper.put("Danish", "kykyliky");
		LanguageMapper.put("Dutch", "kukeleku");
		LanguageMapper.put("Finnish", "kukko kiekuu");
		LanguageMapper.put("French", "cocorico");
		LanguageMapper.put("German", "kikeriki");
		LanguageMapper.put("Greek", "kikiriki");
		LanguageMapper.put("Hebrew", "coo-koo-ri-koo");
		LanguageMapper.put("Hungarian", "kukuriku");
		LanguageMapper.put("Italian", "chicchirichi");
		LanguageMapper.put("Japanese", "ko-ke-kok-ko-o");
		LanguageMapper.put("Portuguese", "cucurucu");
		LanguageMapper.put("Russian", "kukareku");
		LanguageMapper.put("Swedish", "kuckeliku");
		LanguageMapper.put("Turkish", "kuk-kurri-kuuu");
		LanguageMapper.put("Urdu", "kuklooku");

	}

	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
	}

	public boolean sing(String language) {

		if (language.isEmpty()) {
			System.out.println("Cock-a-doodle-doo");
		} else {
			System.out.println(LanguageMapper.get(language));
		}

		return true;
	}
}
