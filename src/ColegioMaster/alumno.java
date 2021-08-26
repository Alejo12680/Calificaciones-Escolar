
package ColegioMaster;


public class alumno {
    private String id;
    private String nomApell;
    private double nota1;
    private double nota2;
    private double def;
    private String estMat;
    
    public alumno(){
        
    }
    
    public alumno(String id, String nomApell, double nota1, double nota2, double def, String estMat){
        
        this.id=id;
        this.nomApell=nomApell;
        this.nota1=nota1;
        this.nota2=nota2;
        this.def=def;
        this.estMat=estMat;
        
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomApell() {
        return this.nomApell;
    }

    public void setNomApell(String nomApell) {
        this.nomApell = nomApell;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getDef() {
        return this.def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public String getEstMat() {
        return this.estMat;
    }

    public void setEstMat(String estMat) {
        this.estMat = estMat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("alumno{id=").append(id);
        sb.append(", nomApell=").append(nomApell);
        sb.append(", nota1=").append(nota1);
        sb.append(", nota2=").append(nota2);
        sb.append(", def=").append(def);
        sb.append(", estMat=").append(estMat);
        sb.append('}');
        return sb.toString();
    }


    
}
