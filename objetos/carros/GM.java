package objetos.carros;

import locomocao.Locomocao;
import objetos.Carro;
import objetos.Motor;
import objetos.TipoDeVeiculo;

public class GM implements Carro  {

    private String modelo;
    private Integer anoModelo;
    private Integer anoFabrica;
    private Boolean ligado;
    private Float km;
    private Motor motor;
    private TipoDeVeiculo acessorios;
    private Locomocao locomocao;

    public GM(String modelo, Integer anoModelo, Integer anoFabrica,Motor motor, TipoDeVeiculo acessorios) {
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabrica = anoFabrica;
        this.ligado = false;
        this.km = 0F;
        this.motor = motor;
        this.acessorios = acessorios;
        
    }

    @Override
    public void ligarCarro() {
        if(ligado) System.out.println(this.modelo + " ja esta ligado");
        else {
            this.ligado = true;
            System.out.println(this.modelo + " ligado!");
        }
    }


    @Override
    public void desligarCarro() {
        if(locomocao!=null)
        {
            this.parar();
        }
        if(this.ligado){
            this.ligado = false;
            System.out.println(this.modelo +" desligado");
        }else System.out.println("Carro não esta ligado. ");
    }


    @Override
    public void andar() {
        if(this.ligado==false) 
            ligarCarro();
        this.locomocao = new Locomocao();
        locomocao.start();
        System.out.println(this.modelo + " em movimento");
    }
    
    @Override
    public void parar(){
        locomocao.interrupt();
        this.km += locomocao.getKm();
        locomocao=null;
        System.out.println("Freiando.................. Parado!!!");
    }

    @Override
    public void dadosVeiculo() {
        System.out.println("GM "+ this.modelo + "," +
                " Motor: " + this.motor.modeloMotor() + "," +
                " Ano Modelo: " + this.anoModelo + "," +
                " Ano Fabrica: " + this.anoFabrica + "," +
                " KM: " + this.km + "," +
                " Acessorios: "+ this.acessorios.meusAcessorios());
    }
}
