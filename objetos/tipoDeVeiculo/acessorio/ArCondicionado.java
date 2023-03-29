package objetos.tipoDeVeiculo.acessorio;

import objetos.tipoDeVeiculo.Acessorio;

public class ArCondicionado implements Acessorio {

    private String modelo;



    public ArCondicionado(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String modeloAcesserio() {
        return " Modelo: " + this.modelo;
    }
    
}
