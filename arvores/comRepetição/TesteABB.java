import java.util.Random;
 
public class TesteABB {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(501) + 5;
        int[] v = new int[n];
        ABB abb = new ABB();
        for (int i = 0; i<200; i++) {
            v[i] = random.nextInt(n/5) + 1;
            System.out.print(v[i] + " ");
            abb.insere(v[i]);
        }
        System.out.println("\nn: " + n);
        System.out.println("\nA árvore:\n" + abb.stringEmOrdem());
        System.out.println("\nNível: " + abb.nivel());
        System.out.println("\nNúmero de nós: " + abb.numeroNos() + "\n");
    }
}
