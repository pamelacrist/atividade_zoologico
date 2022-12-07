public class Mamifero extends Animal{
    private String qtd_gestacao;
    
    public Mamifero (int id,String nome,String especie ,String qtd_gestacao) {
        super(id,nome,especie);
        this.qtd_gestacao = qtd_gestacao;
    }
    
    public String getqtd_gestacao() {
        return qtd_gestacao;
    }
    public void setqtd_gestacao(String qtd_gestacao) {
        this.qtd_gestacao = qtd_gestacao;
    }
}