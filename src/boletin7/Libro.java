
package boletin7;


public class Libro {
    
    private String tituloLibro;
    private String autorLibro;
    private int nEjemplares;
    private int nEjemplaresprestados;

   
    
    public void Libro(){
        
    }
        
    public Libro(String tituloLibro, String autorLibro, int nEjemplares, int nEjemplaresprestados) {
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.nEjemplares = nEjemplares;
        this.nEjemplaresprestados = nEjemplaresprestados;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getnEjemplaresprestados() {
        return nEjemplaresprestados;
    }

    public void setnEjemplaresprestados(int nEjemplaresprestados) {
        this.nEjemplaresprestados = nEjemplaresprestados;
    }

    public boolean prestamo (){
        if(nEjemplares>0){
            //nEjemplares -=1 
            nEjemplares=nEjemplares-1;
            //nEjemplaresprestados +=1
            nEjemplaresprestados = nEjemplaresprestados+1;
            return true;
        }
            else {
                return false;
        }
    }
    public boolean devolucion (){
        if (nEjemplaresprestados>0){
            nEjemplaresprestados = nEjemplaresprestados -1;
            nEjemplares = nEjemplares+1;
            return true;
    }
        else {
            return false;      
        }
    }

    @Override
    public String toString() {
        String mensaje= "El titulo de libro es " + tituloLibro + " ,escrito por " + autorLibro + " , hay " + nEjemplares + " exemplares disponibles y " +
+nEjemplaresprestados+" exemplares prestados";
        return mensaje;
    }
    
    public void comprobar(boolean x){
        if(x=true){
            System.out.println("El libro se puede prestar");
        }else{
            System.out.println("El libro no se puede prestar");
        }
    }
   
}
    


   
    