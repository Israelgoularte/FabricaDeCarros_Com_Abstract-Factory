package objetos.tipoDeVeiculo;

import objetos.TipoDeVeiculo;
import objetos.tipoDeVeiculo.acessorio.DirecaoHidraulica;

public class Basico implements TipoDeVeiculo {

    private Acessorio direcaoHidraulica;
    

    public Basico(String modelo) {
        this.direcaoHidraulica = new DirecaoHidraulica(modelo);
    }

    @Override
    public String meusAcessorios() {
        return "Direção Hidraulica: " +direcaoHidraulica.modeloAcesserio();
    }
    
}
