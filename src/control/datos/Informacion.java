package control.datos;//ERICK ALFONSO MERINO ROQUE

import java.util.Vector;
import control.usuarios.Estudiante;
import javax.swing.JOptionPane;

public class Informacion {
    static Vector vector=new Vector();
    static Estudiante persona=new Estudiante();
    
    public static void GuardaEstudy(Estudiante persona){
        if(vector.add(persona)){
            JOptionPane.showMessageDialog(null,"Se ha agregado correctamente la persona");
    }
    }
public static String MostrarInfo(){
    String Linea="", Linea2;
    for(int x=0;x<vector.size();x++){
        persona=(Estudiante)vector.get(x);
        Linea2=persona.NoControl+"-"+persona.Nombre+" - "+persona.Apellidos+" - "+persona.RFC+" - "+persona.Email+" - "+persona.Telefono+"-"+persona.Materia1+"-"+persona.Materia2+"-"+persona.Materia3+"-"+persona.Materia4+"-"+persona.Materia5;
                
        Linea=Linea+Linea2+"\n";
        }
    return Linea;
}
}