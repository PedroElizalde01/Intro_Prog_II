public class Reserva{
  Room room;
  Date dateIn;
  Date dateOut;

  public Reserva(Room room, Date dateIn, Date dateOut){
    this.room = room;
    this.dateIn = dateIn;
    this.dateOut = dateOut;
  }

  public String roomType(){
    return "Tipo de habitacion: " + room.type();
  }

  public String firstDate(){
    return (dateIn.dateToString());
  }

  public String lastDate(){
    return (dateOut.dateToString());
  }
}
