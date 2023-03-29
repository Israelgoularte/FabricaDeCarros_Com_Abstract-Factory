package fabricas;

import objetos.Carro;
import objetos.Motor;
import objetos.TipoDeVeiculo;
import objetos.carros.GM;
import objetos.motor.VHC;
import objetos.tipoDeVeiculo.Basico;

public class CorsaBasico implements Veiculo{
    @Override
    public Carro fabricaVeiculo() {
        return new GM("Corsa", 2022, 2023, fabricarMotor(), fabricarAcessorios());
    }

    @Override 
    public Motor fabricarMotor() {
        return new VHC("2019");
    }

    @Override
    public TipoDeVeiculo fabricarAcessorios(){
        return new Basico("1.0");
    }
}
