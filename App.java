import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Ave> aves = new ArrayList<>();
    private static List<Mamifero> mamiferos = new ArrayList<>();
    private static List<Repteis> repteis = new ArrayList<>();
    private static List<Animal> animais = new ArrayList<>();
    private static List<Jaula> jaulas = new ArrayList<>();
    private static List<Alimentacao> alimentacoes = new ArrayList<>();
    private static List<Limpeza> limpezas = new ArrayList<>();

    public static void main(String[] args) {
       
        System.out.println("=== Menu : ===");
        System.out.println("+--------------------------+");
        System.out.println("| 1 - cadastrar Animal     |");
        System.out.println("| 2 - listar Animal        |");
        System.out.println("| 3 - cadastrar alimentacao|");
        System.out.println("| 4 - Listar alimentacao   |");
        System.out.println("| 5 - cadastrar jaula      |");
        System.out.println("| 6 - Listar jaula         |");
        System.out.println("| 7 - cadastrar limpeza    |");
        System.out.println("| 8 - Listar limpeza       |");
        System.out.println("+--------------------------+");

        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            case 1:
                cadastrarAnimal(scanner);
                
                break;
            case 2:
                System.out.println("Numero|Nome|Especie");
                for(Animal animal : animais) {
                    System.out.println(animal.getId() +animal.getnome()+"|"+animal.getespecie());
                }
                break;
            case 3:
                cadastraralimentacao(scanner);
                break;
            case 4:
                System.out.println("alimentacao");
                System.out.println("Numero|Data|Descricao");
                for(Alimentacao alimentacao : alimentacoes) {
                    System.out.println(alimentacao.getId() +"|"+alimentacao.getdata() +'|' + alimentacao.getdescricao());
                }
                break;
            case 5:
                cadastrarjaula(scanner);
                break;
            // Lista Extra
            case 6:
                System.out.println("jaulas");
                System.out.println("Numero|Nome|Tipo");
                for(Jaula jaula : jaulas) {
                    System.out.println(jaula.getId() +"|"+jaula.getnome()+"|"+jaula.gettipo());
                }
                break;
            case 7:
                cadastrarLimpeza(scanner);
                break;
            case 8:
                System.out.println("limpeza");
                System.out.println("Numero|Data|Descricao");
                for(Limpeza limpeza : App.limpezas) {
                    System.out.println(limpeza.getId()+"|"+limpeza.getdata()+"|"+limpeza.getdescricao());
                }
                break;
            default:
                System.out.println("Operacao invalida");
                break;
        }
        main(args);
        scanner.close();
    }
        
    private static void cadastrarLimpeza(Scanner scanner) {
        System.out.println("digite a data:");
        String data = scanner.next();
        System.out.println("digite a descricao:");
        String descricao = scanner.next(); 
        System.out.println("digite o numero da Jaula:");
        int idJaula = scanner.nextInt(); 
        try {
            Jaula jaula = jaulas.get(idJaula-1);
            Limpeza limpeza = new Limpeza(App.limpezas.size()+1,data, descricao, jaula);
            App.limpezas.add(limpeza);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void cadastrarjaula(Scanner scanner) {
        System.out.println("digite a nome:");
        String nome = scanner.next();
        System.out.println("digite a tipo:");
        String tipo = scanner.next();
        Jaula jaula = new Jaula(App.jaulas.size()+1,nome, tipo);
        App.jaulas.add(jaula);
    }
    private static void cadastraralimentacao(Scanner scanner) {
        System.out.println("digite a data:");
        String data = scanner.next();
        System.out.println("digite a descricao:");
        String descricao = scanner.next();
        System.out.println("Informe o número do animal:");
        int idAnimal = scanner.nextInt();
        try {
            Animal animal = animais.get(idAnimal-1);
            if (animal == null) {
                throw new Exception("numero não existente");
            }
            Alimentacao alimentacao = new Alimentacao(App.alimentacoes.size()+1, data, descricao, animal);
            App.alimentacoes.add(alimentacao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static  void cadastrarAnimal(Scanner scanner) {
        System.out.println("Informe o número da jaula:");
        int idJaula = scanner.nextInt();
        System.out.println("digite o nome:");
        String nome = scanner.next();
        System.out.println("digite a especie:");
        String especie = scanner.next();
        System.out.println("Digite o tipo: ([A] Ave; [M] Mamifero; [R] Repteis;)");
        String tipo = scanner.next();
        switch (tipo) {
            case "A":
                System.out.println("digite a plumagem:");
                String plumagem = scanner.next();
                Ave ave = new Ave(App.aves.size()+1,nome, especie, plumagem);
                App.aves.add(ave);
                App.animais.add(ave);
                try {
                    App.jaulas.get(idJaula-1).addAnimal(ave);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "M":
                System.out.println("digite a qtd de gestacao:");
                String qtd_gestacao = scanner.next();
                Mamifero mamifero = new Mamifero(App.mamiferos.size()+1,nome, especie, qtd_gestacao);
                App.mamiferos.add(mamifero);
                App.animais.add(mamifero);
                App.jaulas.get(idJaula-1).addAnimal(mamifero);
                break;
            case "R":
                System.out.println("digite a habitats aquatico:");
                String habitats_aquatico = scanner.next();
                System.out.println("digite a sub aquatico:");
                String sub_aquatico = scanner.next();
                System.out.println("digite a terrestre:");
                String terrestre = scanner.next();
                Repteis reptel = new Repteis(App.repteis.size()+1,nome, especie, habitats_aquatico,sub_aquatico,terrestre);
                App.repteis.add(reptel);
                App.animais.add(reptel);
                App.jaulas.get(idJaula-1).addAnimal(reptel);
                break;
            default:
                break;
        }
    }
}

