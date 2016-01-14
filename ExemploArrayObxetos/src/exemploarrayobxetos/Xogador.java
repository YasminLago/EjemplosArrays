package exemploarrayobxetos;

public class Xogador {
    private String nome;
    private int dorsal;

    public Xogador() {
    }

    public Xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Xogador{" + "nome=" + nome + ", dorsal=" + dorsal + '}';
    }
    
}