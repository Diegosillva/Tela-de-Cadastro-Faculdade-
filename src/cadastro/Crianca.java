package cadastro;


public class Crianca extends Dados  {
private Responsavel Responsavel;

    public Responsavel getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(Responsavel Resposavel) {
        this.Responsavel = Resposavel;
    }
    public Crianca() {
    }
    
    public Boolean MenorIdade(){
       int idadeMinima =  10;
       if (getIdade() <= idadeMinima){
           return true;
       }
       else{
           return false;
       }
       
    }
    
    
}
