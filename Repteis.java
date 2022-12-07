public class Repteis  extends Animal{
    private String habitats_aquatico;
    private String sub_aquatico;
    private String terrestre;
    
    public Repteis (int id,String nome,String especie ,String habitats_aquatico, String sub_aquatico,String terrestre) {
        super(id,nome,especie);
        this.habitats_aquatico = habitats_aquatico;
        this.sub_aquatico = sub_aquatico;
        this.terrestre = terrestre;
    }
    
    public String gethabitats_aquatico() {
        return habitats_aquatico;
    }
    public void sethabitats_aquatico(String habitats_aquatico) {
        this.habitats_aquatico = habitats_aquatico;
    }
    public String getsub_aquatico() {
        return sub_aquatico;
    }
    public void setsub_aquatico(String sub_aquatico) {
        this.sub_aquatico = sub_aquatico;
    }
    public String getterrestre() {
        return terrestre;
    }
    public void setterrestre(String terrestre) {
        this.terrestre = terrestre;
    }
}
