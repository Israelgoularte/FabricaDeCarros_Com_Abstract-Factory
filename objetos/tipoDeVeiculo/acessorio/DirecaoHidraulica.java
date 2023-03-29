package objetos.tipoDeVeiculo.acessorio;

import objetos.tipoDeVeiculo.Acessorio;

public class DirecaoHidraulica implements Acessorio {
    
    private String modelo;


    public DirecaoHidraulica(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String modeloAcesserio() {
        return " Modelo: " + this.modelo;
    }
}
