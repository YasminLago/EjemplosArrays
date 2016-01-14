package exemploarray1;
//Yasmin
public class Metodos {
    //Collemos espazo para sete elementos tipo float
    //Declaracion:
    //float[]temperaturas={1f,2f,3f,4f,5f,6f,7f};
    //Declaracion y creacion:
    float[]temperaturas=new float[7];
    public void crearArray(){
        for(int i=0;i<temperaturas.length;i++)
            temperaturas[i]=i+1;
    }
    public void visualizar(){
        for(int z=0;z<temperaturas.length;z++)
        System.out.println("Temperaturas["+z+"]="+temperaturas[z]);
    }
}