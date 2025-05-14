import java.time.LocalDate;
import java.util.List;

public class aluno{
    private String cpf, nome, sexo;
    private int matricula;
    private LocalDate dataNascimento;
    private endereco endereco;
    private List<contato> contatos;

    public aluno(String cpf, String nome, String sexo, int matricula, LocalDate dataNascimento, endereco endereco,
            List<contato> contatos) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contatos = contatos;
    }

   public List<contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<contato> contatos) {
        this.contatos = contatos;
    }
    
   public endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }
        
    public aluno() {
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getMatricula() {
        return matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public boolean validaCPF(){
        return true;
    }
}
