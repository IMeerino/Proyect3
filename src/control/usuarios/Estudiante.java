package control.usuarios;//ERICK ALFONSO MERINO ROQUE

public class Estudiante {
    public String NoControl;
    public String Nombre;
   public String Apellidos;
    public String RFC;
    public String Email;
    public String Telefono;
    public String Materia1;
    public String Materia2;
    public String Materia3;
    public String Materia4;
    public String Materia5;
    
    public Estudiante(){
    }
    //CONSTRUCTOR DE LOS DATOS
    public Estudiante(String NoControl,String Nombre, String Apellidos, String RFC, String Email, String Telefono,String Materia1, String Materia2, String Materia3, String Materia4,String Materia5){
        this.NoControl=NoControl;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.RFC=RFC;
        this.Email=Email;
        this.Telefono=Telefono;
        this.Materia1=Materia1;
        this.Materia2=Materia2;
        this.Materia3=Materia3;
        this.Materia4=Materia4;
        this.Materia5=Materia5;
    }

}
