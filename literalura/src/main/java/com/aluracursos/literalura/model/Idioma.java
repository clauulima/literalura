package com.aluracursos.literalura.model;

public enum Idioma {
    ES("es"),
    FR("fr"),
    EN("en"),
    PT("pt");

    private String idioma;

    private Idioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public static Idioma fromString(String text) {
        for (Idioma idioma : Idioma.values()) {
            if (idioma.idioma.equalsIgnoreCase(text)) {
                return idioma;
            }
        }
        throw new IllegalArgumentException("No se ha encontrado: " + text);
    }
}
