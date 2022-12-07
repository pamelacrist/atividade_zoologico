public abstract class Animal {

    private int id;
    private String nome;
    private String especie;

    protected void name() {
        
    } Animal(int id,String nome,String especie) {

        this.id = id;
        this.nome = nome;
        this.especie = especie;

    }
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getespecie() {
        return especie;
    }

    public void setespecie(String especie) {
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}