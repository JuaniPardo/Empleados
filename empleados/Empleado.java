package empleados;

public class Empleado {

    //##### DECLARACION VARIABLES INSTANCIA ######
    private int id; //PRIMITIVO
    private String nombre; //REFERENCIA
    private String apellido; //REFERENCIA
    private double salario; //PRIMITIVO

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nEmpleado "+ id +
                "\nNombre: \t" + nombre +
                "\nApellido: \t" + apellido +
                "\nSalario: \t" + salario;
    }
}
