import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Animal> animals = new ArrayList<>();
    private List<Person> persons = new ArrayList<>();
    private List<Tractor> tractors = new ArrayList<>();

    public void addEmpleado(Empleado empleado) {
        persons.add(empleado);

    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
