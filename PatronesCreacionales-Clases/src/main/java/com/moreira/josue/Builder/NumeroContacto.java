package com.moreira.josue.Builder;

public class NumeroContacto {
    private String nroCelular;
    private String extension;
    private String tipoNumero;

    public NumeroContacto() {
        super();
    }
    public NumeroContacto(String nroCelular, String extension, String tipoNumero) {
        super();
        this.nroCelular = nroCelular;
        this.extension = extension;
        this.tipoNumero = tipoNumero;
    }

    public String getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(String tipoNumero) {
        this.tipoNumero = tipoNumero;
    }
}
