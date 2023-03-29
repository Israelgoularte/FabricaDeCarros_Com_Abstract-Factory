package locomocao;

public class Locomocao extends Thread{
    private Float km;

    public Locomocao (){
        km=0F;
    }

    public Float getKm(){
        return km;
    }
    
    @Override
    public void run() {
        while(true){
            km += 0.000001f;
        }
    }
}
