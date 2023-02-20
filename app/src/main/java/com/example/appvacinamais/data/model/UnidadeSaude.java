package com.example.appvacinamais.data.model;

public class UnidadeSaude {

    private String nome;
    private String estado;
    private String municipio;
    private String regiao;
    private boolean perfil;
    private int cnes;

    public UnidadeSaude(String nome, String estado, String municipio, String regiao, boolean perfil, int cnes) {
        this.nome = nome;
        this.estado = estado;
        this.municipio = municipio;
        this.regiao = regiao;
        this.perfil = perfil;
        this.cnes = cnes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public boolean isPerfil() {
        return perfil;
    }

    public void setPerfil(boolean perfil) {
        this.perfil = perfil;
    }

    public int getCnes() {
        return cnes;
    }

    public void setCnes(int cnes) {
        this.cnes = cnes;
    }
}
