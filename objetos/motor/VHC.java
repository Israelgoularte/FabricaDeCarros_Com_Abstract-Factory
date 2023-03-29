package objetos.motor;

import objetos.Motor;

public class VHC implements Motor{
    
    private String modelo;


    public VHC(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public Motor fabricarMotor(String Modelo) {
        return new V8(Modelo);
    }


    @Override
    public String modeloMotor() {
        return "VHC modelo: " + this.modelo;
    }
}
