public class Main {

    public static void main(String[] args) throws Exception {
        // Your code here!

        Empleado empleado = new Empleado("Eze", 10, true);
        System.out.println(empleado.isActive());

        empleado.setActive(false);
        System.out.println(empleado.isActive());

        Farm farm = new Farm();
        farm.getAnimals().add(new Perro());
        if (farm.getAnimals().isEmpty()) {
            System.out.println("no hay animales");
        } else {
            System.out.println("hay animales");

        }
        farm.addEmpleado(empleado);

        for (Person person : farm.getPersons()) {
            System.out.println(person.getName());
        }
    }
}
