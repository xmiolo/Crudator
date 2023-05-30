package com.auto.crudator;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Generate {

    public static void main(String[] args) throws IOException, TemplateException {
        // Configura o FreeMarker
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
        cfg.setClassForTemplateLoading(Generate.class, "/");
        cfg.setDefaultEncoding("UTF-8");

        // Carrega o template
        Template template = cfg.getTemplate("/templates/layout.ftl");

        // Define as variáveis do template
        Map<String, Object> variables = new HashMap<>();
        variables.put("title", "Minha Página");
        variables.put("message", "Bem-vindo ao meu site!");

        // Processa o template e gera o arquivo HTML
        FileWriter writer = new FileWriter(new File("output.html"));
        template.process(variables, writer);
        writer.close();
    }
}
