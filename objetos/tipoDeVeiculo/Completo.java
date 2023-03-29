package objetos.tipoDeVeiculo;

import objetos.TipoDeVeiculo;
import objetos.tipoDeVeiculo.acessorio.ArCondicionado;
import objetos.tipoDeVeiculo.acessorio.DirecaoHidraulica;

public class Completo implements TipoDeVeiculo{
    private Acessorio direcaoHidraulica;
    private Acessorio arCondicionado;
    

    public Completo(String modeloArcondicionado, String modeloDirecao) {
        this.arCondicionado = new ArCondicionado(modeloArcondicionado);
        this.direcaoHidraulica = new DirecaoHidraulica(modeloDirecao);
    }

    @Override
    public String meusAcessorios() {
        return "Direção Hidraulica " +direcaoHidraulica.modeloAcesserio() + ", ArCondicionado " + this.arCondicionado.modeloAcesserio();
    }
}
