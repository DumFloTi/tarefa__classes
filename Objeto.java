/**
* Tipo de objeto e suas características
*/
public class Objeto {
    public static void main (String args[]) {
        Estrutura objeto = new Estrutura();
        objeto.definirCubo();

        System.out.println("Nome: " + objeto.getNome());
        System.out.println("Faces: " + objeto.getFaces());
        System.out.println("Arestas: " + objeto.getArestas());
        System.out.println("Vértices: " + objeto.getVertices());
        System.out.println("Face Rígida: " + (objeto.isTipoFace()));
    }
}