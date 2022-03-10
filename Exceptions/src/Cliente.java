public class Cliente{
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private long numTelefono;

    public Cliente(long id, String nombre, String apellido, String email, long numTelefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numTelefono = numTelefono;
    }
    public Long getId() {
        return id;
    }
    public Long getNumTelefono() {
        return numTelefono;
    }
    public void setNumTelefono(Long numTelefono) {
        this.numTelefono = numTelefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(Long id) {
        this.id = id;
    }
}