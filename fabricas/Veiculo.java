package fabricas;

import objetos.Carro;
import objetos.Motor;
import objetos.TipoDeVeiculo;

public interface Veiculo {

    public Carro fabricaVeiculo();

    public Motor  fabricarMotor();

    public TipoDeVeiculo fabricarAcessorios();
    
}
