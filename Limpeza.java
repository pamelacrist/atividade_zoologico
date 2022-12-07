public class Limpeza {

    private int id;
    private String data;
    private String descricao;
    private Jaula jaula;




    public Limpeza(int id,String data, String descricao,  Jaula jaula) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.jaula = jaula;
    }

    public Jaula getJaula() {
        return jaula;
    }

    public void setJaula(Jaula jaula) {
        this.jaula = jaula;
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

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

}