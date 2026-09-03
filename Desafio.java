
import java.util.LinkedList;
import java.util.List;

public class Desafio {
    private int qtd;
    private int contador = 0;
    private LinkedList<Integer> sol = new LinkedList<>();

    public Desafio(int qtd) {
        this.qtd = qtd;
    }

    public void resolve(LinkedList<Integer> conj) {
        if (qtd == contador) {
            System.out.print(sol + "\n");
            return;
        }
        if (conj.size() == 0) {
            return;
        }

        int elem = conj.get(0);

        sol.add(elem);
        contador++;
        conj.remove(0);

        resolve(conj);


        sol.removeLast();
        contador--;

        resolve(conj);
        conj.addFirst(elem);
    }
}

class main {
    public static void main(String[] args) {
        Desafio test = new Desafio(7);

        LinkedList<Integer> conj = new LinkedList<>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8));

        test.resolve(conj);

    }
}