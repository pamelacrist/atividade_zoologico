public class Ave  extends Animal{
    private String plumagem;
    
    
    public Ave (  int id,String nome,String especie , String plumagem) {
        super(id,nome,especie);
        this.plumagem = plumagem;
    }
    
    public String getplumagem() {
        return plumagem;
    }
    public void setplumagem(String plumagem) {
        this.plumagem = plumagem;
    }
}