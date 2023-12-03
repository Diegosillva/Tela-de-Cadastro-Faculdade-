package cadastro;

public class Responsavel extends Dados{

    
    public Responsavel() {
    }
    
    public Boolean MaiorIdade()
    {
        int idadeMinima = 18;
        if (getIdade() >= idadeMinima )
        {
            return true;
        }
        else{
            return false;
        }
    }
    
}
