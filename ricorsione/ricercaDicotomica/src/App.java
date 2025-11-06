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

    public static int cercaMinimo(int[] v, int minimo, int ultimo){

        //clausola di chiusura, se ho controllato tutto l'array
        if (ultimo == 0)
            return minimo;
        
        if (minimo > v[ultimo])
            minimo = v[ultimo];

        return cercaMinimo(v, minimo, ultimo);
    }

    public static int cercaUltimoBetter(int[] v, int ultimo){
        //clausola ricorsiva
        if (ultimo == 0)
            return v[ultimo];
        //chiamata ricorsiva
        return Math.min(v[ultimo], cercaUltimoBetter(v, ultimo-1));
    }

    public static void bubbleSort(int[] v, int fine){
        //clausola ricorsiva
            if (fine == 0) //se l'array è lungo 1, è gia ordinato di default
                return;
        //analisi dell'array e spostamento del max in fondo
            for (int i = 0; i < fine-1; i++){
                if (v[i] > v[i+1])
                    swap(v, i, i+1);
            }
        //chiamata ricorsiva
        bubbleSort(v, fine -1);
    }

    public static void shakerSort(int[] v, int inizio){

    }

    //Da sistemare magari ecco
    public static void shakerSortLeft(int[] v, int inizio, int fine){
        //clausola ricorsiva
        if (inizio >= fine) //se l'array è lungo 1, è gia ordinato di default
            return;
        //analisi dell'array e spostamento del max in fondo
            for (int i = 0; i < fine-1; i++){
                if (v[i] > v[i-1])
                    swap(v, i, i+1);
            }
        //chiamata ricorsiva
        shakerSortRight(v, inizio +1, fine);        
    }

    public static void shakerSortRight(int[] v, int inizio, int fine){
        //clausola ricorsiva
        if (inizio >= fine)
            return; //se l'array è lungo 1, è gia ordinato di default
        //analisi dell'array e spostamento del max in fondo
            for (int i = inizio; i < fine; i++){
                if (v[i] > v[i+1]){
                    swap(v, i, i+1);
                }
            }
        //chiamata ricorsiva
        shakerSortLeft(v, inizio, fine -1);
    }

    public static void swap(int[] v, int i, int j){
        int temp;
        temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}
