import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("01001000");
        System.out.println(novoEndereco);

    }
}