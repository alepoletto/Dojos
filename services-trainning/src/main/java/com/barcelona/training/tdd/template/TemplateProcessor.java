package com.barcelona.training.tdd.template;

public class TemplateProcessor {

	public String apply(String message, String name) {
		return message.replace("$nome", name);
	}

}
