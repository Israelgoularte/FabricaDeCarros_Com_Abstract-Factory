package fabricas;
import objetos.Carro;
import objetos.Motor;
import objetos.TipoDeVeiculo;
import objetos.carros.Volkswagen;
import objetos.motor.V8;
import objetos.tipoDeVeiculo.Basico;

public class GolBasico implements Veiculo {
    @Override
    public Carro fabricaVeiculo() {
        return new Volkswagen("Gol", 2022, 2023, fabricarMotor(), fabricarAcessorios());
    }

    @Override 
    public Motor fabricarMotor() {
        return new V8("1997");
    }

    @Override
    public TipoDeVeiculo fabricarAcessorios(){
        return new Basico("1.0");
    }
}
