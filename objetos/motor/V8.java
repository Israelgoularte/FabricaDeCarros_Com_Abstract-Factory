package objetos.motor;

import objetos.Motor;

public class V8 implements Motor{
    private String modelo;


    public V8(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public Motor fabricarMotor(String modelo) {
        return new V8(modelo);
    }


    @Override
    public String modeloMotor() {
        return "V8 modelo: " + this.modelo;
    }

    
}
