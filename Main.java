public class Main {
    public static void main(String[] args) {
        Lista_Estatica<Integer> lista_Estatica = new Lista_Estatica<>(5);

        lista_Estatica.adicionar(10);
        lista_Estatica.adicionar(20);
        lista_Estatica.adicionar(30);

        System.out.println("O topo do elemento é: " + lista_Estatica.getDado(lista_Estatica.getTamanho() - 1));

        System.out.println("O tamanho da lista é: " + lista_Estatica.getTamanho());

        lista_Estatica.adicionar(40);
        System.out.println("O elemento que foi adicionado foi o número: " + lista_Estatica.getDado(lista_Estatica.getTamanho() - 1));

        lista_Estatica.adicionar(50);
        System.out.println("O elemento que foi adicionado foi o número: " + lista_Estatica.getDado(lista_Estatica.getTamanho() - 1));

        System.out.println("O tamanho da lista após o adicionamento é: " + lista_Estatica.getTamanho());
    }
}
