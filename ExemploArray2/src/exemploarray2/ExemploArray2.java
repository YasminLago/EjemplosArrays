package exemploarray2;
//Yasmin
public class ExemploArray2 {
float[]temperaturas=new float[7];
public void traballarArray(){
    Metodos m=new Metodos();
      m.visualizar(temperaturas);
      m.crearArray(temperaturas);
      m.visualizar(temperaturas);
}
    public static void main(String[] args) {
        ExemploArray2 aux=new ExemploArray2();
        aux.traballarArray();
      
    }
    
}