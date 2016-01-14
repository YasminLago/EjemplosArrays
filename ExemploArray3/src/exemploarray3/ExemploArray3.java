package exemploarray3;
//Yasmin
public class ExemploArray3 {
float[]temperaturas=new float[7];
public void traballarArray(){
    Metodos m=new Metodos();
      m.visualizar(temperaturas);
      m.crearArray(temperaturas);
      m.visualizar(temperaturas);
      float[]resposta=m.duplicar(temperaturas);
      m.visualizar(resposta);
}
    public static void main(String[] args) {
        ExemploArray3 aux=new ExemploArray3();
        aux.traballarArray();
    }
    
}