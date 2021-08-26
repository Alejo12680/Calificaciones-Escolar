
package ColegioMaster;

import java.util.ArrayList;

public class curso {
    //private int codCurso;
    private String nomCurso;   
    private ArrayList<alumno> objAlumno = new ArrayList();
    
    public curso(){
        
    }

    public curso (String nomCurso) {
        
    this.nomCurso = nomCurso;
    }

//    public int getCodCurso() {
//        return this.codCurso;
//    }
//
//    public void setCodCurso(int codCurso) {
//        this.codCurso = codCurso;
//    }

    public String getNomCurso() {
        return this.nomCurso;
    }

    public void setNomCurso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    @Override
    public String toString() {
        return "curso{" + ", nomCurso=" + nomCurso + ", objAlumno=" + objAlumno + '}';
    }
    
    
    
    //Metodos:
    public void agregarAlumno(alumno alumno1){
        objAlumno.add(alumno1);
    }
    
    public void mostrarAlumnos(){
        for (int i = 0; i < objAlumno.size(); i++) {
            System.out.println(objAlumno.get(i));
            
        }
    }
    
    public double calculoDefinitiva(){
        double nota1=0;
        double nota2=0;
        double def = 0;
        for (int i = 0; i < objAlumno.size(); i++) {
            nota1 = objAlumno.get(i).getNota1();
            nota2 = objAlumno.get(i).getNota2();
            def = (nota1+nota2)/2;
            objAlumno.get(i).setDef(def);
            if (def >= 3.0) {
                objAlumno.get(i).setEstMat("Aprobo");
                
            }
            else if (def >= 2.6 && def < 2.9) {
                objAlumno.get(i).setEstMat("Abilitar");
                
            }
            else{
                objAlumno.get(i).setEstMat("Perdio");
            }
            
        }
        return def;
    }
    
    public void alumnoMax(String nomCurso){
        double bandera4 = 0.0;
        double bandera5=0.0;
        
        for (int i = 0; i < objAlumno.size(); i++) {
            bandera4 = objAlumno.get(i).getDef();
            if (bandera4 > bandera5) {
                bandera5 = bandera4;
                
            }
            
        }
        Double variable = new Double(bandera5);
        int varible2 = -1;
        
        for (int i = 0; i < objAlumno.size(); i++) {
            Double variable3 = new Double(objAlumno.get(i).getDef());
            if (variable3.equals(variable)) {
                varible2 = i;
                break;
            }
        }
        System.out.println("El mejor alumno del curso " + nomCurso+ " y el alumno "+ objAlumno.get(varible2).getNomApell()+ " y la nota final de "+ bandera5 + " " + objAlumno.get(varible2).getEstMat());
    }
    
}

    

          

