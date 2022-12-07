public class Alimentacao{

    private int id;
    private String data;
    private String descricao;
    private Animal animal;

 
    public Alimentacao(int id,String data, String descricao, Animal animal) {

        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.animal = animal;

    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getdata() {
        return data;
    }

    public void setdata(String data) {
        this.data = data;
    }
    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }
}