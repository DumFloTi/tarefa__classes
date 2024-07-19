/**
* Definir a estrutura dum objeto
*/

public class Estrutura {
    private String nome;
    private int faces;
    private int arestas;
    private int vertices;
    private boolean tipoFace;

    /**
     * Buscar o nome do obejto
     */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Buscar as faces do obejto
     */
    public int getFaces() {
        return faces;
    }
    public void setFaces(int faces) {
        this.faces = faces;
    }

    /**
     * Buscar as arestas do obejto
     */
    public int getArestas() {
        return arestas;
    }
    public void setArestas(int arestas) {
        this.arestas = arestas;
    }

    /**
     * Buscar as vertices do obejto
     */
    public int getVertices() {
        return vertices;
    }
    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    /**
     *Tipo de face do obejto, rigida ou suave / true ou false
     */
    public boolean isTipoFace() {
        return tipoFace;
    }
    public void setTipoFace(boolean tipoFace) {
        this.tipoFace = tipoFace;
    }

    /**
     * Definir tipo de obejto
     */
    public void definirCubo() {
        this.nome = "Cubo";
        this.faces = 6;
        this.arestas = 12;
        this.vertices = 8;
        this.tipoFace = true;
    }
}
