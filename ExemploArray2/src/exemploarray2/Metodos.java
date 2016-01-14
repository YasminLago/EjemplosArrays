package exemploarray2;
//Yasmin
public class Metodos {
    public void crearArray(float[]temp){
        for(int i=0;i<temp.length;i++)
            temp[i]=i+1;
    }
    public void visualizar(float[]temperaturas){
        for(int z=0;z<temperaturas.length;z++)
        System.out.println("Temperaturas["+z+"]="+temperaturas[z]);
    }
}