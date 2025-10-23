public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {2, 5, 11, 15, 16, 21, 22, 27, 31};
    }
    public static boolean ricercaDicotomica(int[] v, int cercato, int start, int end){
        boolean trovato = false;
        if (start > end) { // caso base
            return trovato; // condizione uscita 1
        }
        if (v[(start+end)/2] == cercato) {
            return true; // condizione uscita 2
        } else if (cercato < v[(start+end)/2]) {
            return ricercaDicotomica(v, cercato, start, (start+end)/2 - 1);
        } else {
            return ricercaDicotomica(v, cercato, (start+end)/2 + 1, end);
        }

    }
}
