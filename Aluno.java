/**
 * @author vinicius
 *
 * @version 1.0
 *
 * @since 2023
 */
class Aluno {

    private String nome;
    private int telefone;
    private String status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static String nomeAluno() {
        return "Vinicius";
    }

    public static int telefoneAluno() {
        return 998448722;
    }

    public static String statusAluno() {

        return "Matriculado";
    }
}
