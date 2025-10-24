package matricesdispersas;

public class Forma2 {

    private Nodo Punta;

    public Forma2() {
        Punta = null;
    }

    public Nodo getPunta() {
        return Punta;
    }

    public void setPunta(Nodo punta) {
        Punta = punta;
    }

    public void Construir(int mat[][]){
        //Crear nodo punta
        //Crear todos los nodos, todos los datos, se necesita la matriz para recorrelar, ver datos diferentes de 0 y ligarlos
        //Lista por columnas

        Nodo x = new Nodo(0,mat.length, mat[0].length); //Esta es la cabeza, el dato entero tiene que ser 0, cantidad de filas, cantidad de columnas
        Punta = x;

        Paso1(mat);
        Paso2(mat);
    }

    public void Paso1(int mat[][]){
        Nodo p = Punta;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 0){
                    Nodo x = new Nodo(mat[i][j], i, j); //Dato, coordenada de file y de columna
                    p.setLigaFila(x); //Ligmos a P con X y luego P avanza a X
                    p = x;
                }
            }
        }
        p.setLigaFila(Punta); //La ligamos a la punta cuando termine de crearse todos los nodos para que quede circular
    }

    public void Paso2(int mat[][]){
        Nodo a = Punta , p;

        for (int c = 0; c < Punta.getCol(); c++) {
            p = Punta.getLigaFila();
                while(p!= Punta){ //Si P es igual a

                    if(p.getCol()== c){
                        a.setLigaColumna(p);
                         a = p;
                    }
                    p = p.getLigaFila();
                }

        }
    }

    public void MostrarPorFilas(){
        //Fila, columna y dato
    }

    public void MostrarPorColumnas(){

    }

    public void SumarFilas(){
        //Fila 0 igual a X
        //Fila 1 igual a X
    }
    public void SumarColumnas(){

    }
}


