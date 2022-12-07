import java.util.ArrayList;
import java.util.List;

public class Jaula {

    private int id;
    private String nome;
    private String tipo; 
    private static List<Animal> animais = new ArrayList<>();

   

    public Jaula(int id,String nome,String tipo ) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        
    }
    
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }
     public String getnome() {

        return nome;
    }

    public void setnome(String nome) {

        this.nome = nome;
    }


    public String gettipo() {

        return  tipo;
    }

    public void settipo(String  tipo) {

        this. tipo =  tipo;
    }

    public  List<Animal> getAnimais() {
        return animais;
    }

    public  void setAnimais(List<Animal> animais) {
        Jaula.animais = animais;
    }
    public  void addAnimal(Animal animal) {
        Jaula.animais.add(animal);
    }

}