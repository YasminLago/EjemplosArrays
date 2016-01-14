
package exemploarray3;
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
    //Devolver arrays:
    public float[]duplicar(float[]tem){
        for(int i=0;i<tem.length;i++)
        tem[i]=tem[i]*2;
        return tem;
    }
}