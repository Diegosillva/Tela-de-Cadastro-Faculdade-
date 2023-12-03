/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro;

/**
 *
 * @author Diego
 */
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // tela de Responsavel
        
        Responsavel responsavel = new Responsavel();
        
        System.out.println();
        System.out.println("Cadastro do Responsavel");
        responsavel.setNomeResponsavel("Diego da silva");
        responsavel.setCPF("123.123.123-11");
        responsavel.setTelefone("9999999999");
        responsavel.setEmail("diego@internet");
        responsavel.setEndereco("Rua Serra Azul");
        responsavel.setIdade(15);
        
        System.out.println(responsavel.getNomeResponsavel());
        System.out.println(responsavel.getCPF());
        System.out.println(responsavel.getTelefone());
        System.out.println(responsavel.getEmail());
        System.out.println(responsavel.getEndereco());
        if (responsavel.MaiorIdade())
        {
            System.out.println("O responsavel e maior de Idade");
        }
        else
        {
            System.out.println("O responsavel e menor de Idade");
        }
        
        
        Crianca crianca = new Crianca();
        
        System.out.println();
        System.out.println("Cadastro da Crianca");
        crianca.setResponsavel(responsavel);
        crianca.setNomeCrianca("Dhiogo");
        crianca.setIdade(10);
        crianca.setSexo("Masculino");
        
        System.out.println(crianca.getResponsavel().getNomeResponsavel());
        System.out.println(crianca.getNomeCrianca());
        System.out.println(crianca.getIdade());
        System.out.println(crianca.getSexo());
        
        if(crianca.MenorIdade())
        {
            System.out.println("OK");
        }
        else{
            System.out.println("Maior de idade, não pode ser cadastrado.");
        }
        
        DadosEstadia estadia = new DadosEstadia();
        System.out.println();
        System.out.println("Tempo de Estadia no Brinquedo");
        estadia.setResponsavel(responsavel);
        estadia.setCrianca(crianca);
        estadia.setTempoUltilizado(45);
        double valorFinal = estadia.Desconto((int)estadia.getTempoUltilizado());
        System.out.println(estadia.getResponsavel().getNomeResponsavel());
        System.out.println(estadia.getCrianca().getNomeCrianca());
        System.out.println(valorFinal);
        
        //Notificação
        
        System.out.println();
        System.out.println("Nome do Responsavel: " + responsavel.getNomeResponsavel());
        System.out.println("CPF Responsavel: " + responsavel.getCPF());
        System.out.println("Telefone Responsavel: " + responsavel.getTelefone());
        System.out.println("Email Responsavel: " + responsavel.getEmail());
        System.out.println("Endereço Responsavel: " + responsavel.getEndereco());
        System.out.println("Nome da Criança: " + crianca.getNomeCrianca());
        System.out.println("Sexo Criança: " + crianca.getSexo());
        System.out.println("Tempo no Brinquedo: " + estadia.getTempoUltilizado());
        System.out.println("Valor a Pagar: " + valorFinal);
        
        
        
        
        
    }
    
}
