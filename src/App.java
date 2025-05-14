import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        endereco casa = new endereco("abc", "Jd Abc", "Ferraz", "SP", "N/D", "08885-550", 29);

        contato celular = new contato(119876044, 11, "celular");

        contato residencial = new contato(114637890, 11, "residencial");

        List<contato> contatos = new ArrayList<>();
        contatos.add(residencial);
        contatos.add(celular);

        //Calendar data = Calendar.getInstance();
        //data.set(2007,Calendar.FEBRUARY,29);
        //Date dataNascimento = data.getTime();
        
        aluno a = new aluno("12345678910","Power Guido",
        "Feminino",29048, LocalDate.of(2007, 02, 28), casa, contatos); 
       System.out.println(a.getNome());
       System.out.println(a.getEndereco().getRua());
    }
}
