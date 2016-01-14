package exemploarrayobxetos;

import javax.swing.JOptionPane;

public class Equipo {
    Xogador[]xogadores=new Xogador[3];
    public String pedirNome(){
       return JOptionPane.showInputDialog("Nome: ");
    }
    public int pedirDorsal(){
        return Integer.parseInt(JOptionPane.showInputDialog("Dorsal: "));
    }
    public void crearArray(){
        for(int i=0;i<xogadores.length;i++)
            //String nome=pedirNome();
            //int dorsal=pedirDorsal();
            //new Xogador(nome,dorsal);
            xogadores[i]=new Xogador(pedirNome(),pedirDorsal());    
    }
    //Visualizamos mediante un for each:
    public void visualizar(){
        for(Xogador xog:xogadores)
            JOptionPane.showMessageDialog(null,xog);
        //Tamen se pode facer:
        /*for(int i=0;i<xogadores.length;i++)
        System.out.println(xogadores[i]);*/
    }
}