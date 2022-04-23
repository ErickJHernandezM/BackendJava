package practicaHarry;

public class DescripcionPersonaje {
    public static void main(String[] args) {
        PersonajesHarry harry= new PersonajesHarry("Harry Potter","Gryffindor","Humano(Hombre)","Dementor","Ciervo");
        PersonajesHarry lucius=new PersonajesHarry("Lucius Malfoy","Slytherin","Humano(Hombre)","Lord Voldemort","Ninguno");
        PersonajesHarry severus=new PersonajesHarry("Severus Snape","Slytherin","Humano(Hombre)","Lord Voldemort","Cierva");
        PersonajesHarry dumbledore = new PersonajesHarry("Albus Percival Wulfric Brian Dombledore","Gryffindor","Humano(Hombre)","El cuerpo de su hermnana Ariana","Fenix");
        PersonajesHarry bellatrix= new PersonajesHarry("Bellatrix Lestrange","Slytherin","Humano(Mujer)");
        PersonajesHarry sirius= new PersonajesHarry("Sirius Black III","Gryffindor","Humano(Hombre)","Desconocido","Perro(Posiblemente)");
        System.out.println(harry.ShowMessage());
        System.out.println(lucius.ShowMessage());
        System.out.println(severus.ShowMessage());
        System.out.println(dumbledore.ShowMessage());
        System.out.println(bellatrix.ShowMessage());
        System.out.println(sirius.ShowMessage());
    }
}
