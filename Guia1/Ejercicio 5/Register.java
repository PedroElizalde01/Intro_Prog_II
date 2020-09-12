// Nombre, Apellido, DNI, Fecha y Hora, empleado o visitante
public class Register{
  private String name;
  private String lastname;
  private String dni;
  private String date;
  private String rol;

  public Register(String name, String lastname, String dni, String date, String rol){
    this.name = name;
    this.lastname = lastname;
    this.dni = dni;
    this.date = date;
    this.rol = rol;
  }
  public String getName(){
    return this.name;
  }
  public String getLastname(){
    return this.lastname;
  }
  public String getDNI(){
    return this.dni;
  }
  public String getDate(){
    return this.date;
  }
  public String getRol(){
    return this.rol;
  }
}
