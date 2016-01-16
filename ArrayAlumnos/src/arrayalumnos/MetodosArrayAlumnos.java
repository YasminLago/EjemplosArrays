package arrayalumnos;
//Yasmin
import java.util.Scanner;

public class MetodosArrayAlumnos {
    int numElementos=pedirNumElementos();
    String[]nomes=new String[numElementos];
    int[]notas=new int[numElementos];
    
    public int pedirNumElementos(){
        Scanner el=new Scanner(System.in);
        System.out.println("Introduce el numero de elementos: ");
        numElementos=el.nextInt(); 
        return numElementos;
    } 
    public String pedirNome(){
        Scanner nom=new Scanner(System.in);
        System.out.println("Introduce un nome: ");
        String nome=nom.next();
        return nome;
    }
    public int pedirNota(){
        Scanner nt=new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        int nota=nt.nextInt();
        return nota;
    }
    public void cargarArray(){
        for(int i=0;i<nomes.length;i++){
            nomes[i]=pedirNome();
            notas[i]=pedirNota();
        }
    }
    public void visualizar(){
        for(int i=0;i<nomes.length;i++){
            System.out.println("Nomes ["+i+"]="+nomes[i]);
            System.out.println("Notas ["+i+"]="+notas[i]);
        }
    }
    
}