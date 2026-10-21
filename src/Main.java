//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche kiaPicanto = new Coche("Kia", "Picanto", 2025, false, 1.0);
        Coche toyotaX = new Coche();
        Coche javaX = new Coche("Python");
        kiaPicanto.setMarca("Nissan");
        System.out.println(kiaPicanto.getMarca());
        System.out.println(kiaPicanto);
        /*System.out.println(kiaPicanto.marca);
        System.out.println(toyotaX.marca);
        System.out.println(javaX.modelo);*/
    }
}