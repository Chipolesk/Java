package br.org.danielchipolesk.model;

public enum GameStatus {

    NAO_INICIADO("NAO INICIADO"),
    INCOMPLETO("INCOMPLETO"),
    COMPLETO("COMPLETO");

    private String label;

   GameStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
