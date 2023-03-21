package No;
public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("conteudo no 1");

        // fazer a referencia do NO1 apontar para o NO2
        No<String> no2 = new No<>("conteudo no 2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("conteudo no 3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("conteudo no 4");
        no3.setProximoNo(no4);
        // no4 aponta para null

        // com o proprio no1 consigo apontar para o no2
        // encadeamento propriamente dito
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}