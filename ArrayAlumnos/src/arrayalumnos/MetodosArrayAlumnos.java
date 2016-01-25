package arrayalumnos;
//Yasmin
import java.util.Scanner;
public class MetodosArrayAlumnos {

    int numElementos = pedirNumElementos();
    String[] nomes = new String[numElementos];
    int[] notas = new int[numElementos];

    public int pedirNumElementos() {
        Scanner el = new Scanner(System.in);
        System.out.println("Introduce el numero de elementos: ");
        numElementos = el.nextInt();
        return numElementos;
    }

    public String pedirNome() {
        Scanner nom = new Scanner(System.in);
        System.out.println("Introduce un nome: ");
        String nome = nom.next();
        return nome;
    }

    public int pedirNota() {
        Scanner nt = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        int nota = nt.nextInt();
        return nota;
    }

    public void cargarArray() {
        for (int i = 0; i < nomes.length; i++) { //nomes.length da o tamaño do array
            nomes[i] = pedirNome();
            notas[i] = pedirNota();
        }
    }

    public void visualizar() {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nomes [" + i + "]=" + nomes[i]);
            System.out.println("Notas [" + i + "]=" + notas[i]);
        }
    }

    /*public String consultarNota() {
        String nomBus=JOptionPane.showInputDialog(null, this, numElementos)
        boolean atopado=false;//non se atopou
 for(int i=0;i<nomes.length;i++){
     if((nomes[i].compareToIgnoreCase(nomBus)==0)){
         atopado=true;
         
     }
 }*/
    

    public void busqueda() {
        String consultaNota=pedirNome();
        for(int i=0;i<numElementos;i++){
            if (consultaNota.equalsIgnoreCase(nomes[i])) {
                System.out.println("Nome: "+nomes[i]+" Nota: "+notas[i]);
            }else {
               System.out.println("Non se encontra o nome");}
        
    }
       
    }
    public void ordenacion(){
        int aux;
        String aux2;
        for(int i=0;i<numElementos-1;i++){
            for(int j=i+1;j<numElementos;j++){
                if(notas[i]>notas[j]){
                    aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                    
                    aux2=nomes[i];
                    nomes[i]=nomes[j];
                    nomes[j]=aux2;
                }     
            }
        }
    }

}