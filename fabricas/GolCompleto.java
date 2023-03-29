package fabricas;
import objetos.Carro;
import objetos.Motor;
import objetos.TipoDeVeiculo;
import objetos.carros.Volkswagen;
import objetos.motor.V8;
import objetos.tipoDeVeiculo.Completo;

public class GolCompleto implements Veiculo{
    @Override
    public Carro fabricaVeiculo() {
        return new Volkswagen("Gol", 2022, 2023, fabricarMotor(), fabricarAcessorios());
    }

    @Override 
    public Motor fabricarMotor() {
        return new V8("1999");
    }

    @Override
    public TipoDeVeiculo fabricarAcessorios(){
        return new Completo("1.6", "Standard");
    }
}
