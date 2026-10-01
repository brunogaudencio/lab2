package lab2;

public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;

    public Disciplina(String nomeDisciplina, int horasEstudo){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = horasEstudo;
        double[] notas = new double[4];
        notas[0] = 0;
        notas[1] = 0;
        notas[2] = 0;
        notas[3] = 0;
    }
}
