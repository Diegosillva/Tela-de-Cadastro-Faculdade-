package cadastro;


public class DadosEstadia {
    
    
    public double Desconto(int tempoMinutos){
        double valorPorMinuto = 1.50;
        
        double valorTotal = tempoMinutos * valorPorMinuto;
        
        double desconto = 0.0;
        if (tempoMinutos > 60)
        {
            desconto = 0.15;
        }else if (tempoMinutos > 40)
        {
            desconto = 0.10;
        }else if (tempoMinutos > 20)
        {
            desconto = 0.50;
        }
            double valorComDesconto = valorTotal - (valorTotal * desconto);
            
            return valorComDesconto;
        
    }
    private Responsavel Responsavel;

    public Responsavel getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(Responsavel Responsavel) {
        this.Responsavel = Responsavel;
    }

    public Crianca getCrianca() {
        return Crianca;
    }

    public void setCrianca(Crianca Crianca) {
        this.Crianca = Crianca;
    }

    public double getTempoUltilizado() {
        return TempoUltilizado;
    }

    public void setTempoUltilizado(double TempoUltilizado) {
        this.TempoUltilizado = TempoUltilizado;
    }
    private Crianca Crianca;
    private double TempoUltilizado;

    public DadosEstadia() {
    }
    
    
}
