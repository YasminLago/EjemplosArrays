package arrayalumnos;
//Yasmin

import javax.swing.JOptionPane;

public class ArrayAlumnos {
    public static void main(String[] args) {
        MetodosArrayAlumnos alumnos=new MetodosArrayAlumnos();
        int opcion;
        do{
        String res=JOptionPane.showInputDialog("Elija una opcion: \n 1.Crear \n 2.Ordenar \n 3.Visualizar \n 4.Buscar \n 5.Sair");
        opcion=Integer.parseInt(res);
        switch(opcion){
            case 1: alumnos.cargarArray();
                break;
            case 2: alumnos.ordenacion();
                break;
            case 3: alumnos.visualizar();
                break;
            case 4: alumnos.busqueda();
                break;
            case 5: System.exit(0);
                break;
            default:System.out.println("Teclea unha opción entre o 1 e o 5");
                System.exit(0);
            }
        }while(opcion>7);

    }
}   