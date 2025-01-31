package actividades.actividad3.productos;

public class Productos {
    private String nombre;
    private String descripcioString;
    private String codigo;
    private String tipoString;
    private double precio;
    private double impuesto
    ;

    public Productos(String nombre, String descripcioString, String codigo, String tipoString, double precio, double impuesto
    ) {
        setNombre(nombre);
        setDescripcioString(descripcioString);
        setCodigo(codigo);
        setTipoString(tipoString);
        setPrecio(precio);
        setImpuesto(impuesto);
    }

    public String getNombre() { return nombre; }
    public String getDescripcionString() { return descripcioString; }
    public String getCodigo() { return codigo; }
    public String getTipoString() { return tipoString; }
    public double getPrecio() { return precio; }
    public double getImpuesto
    () { return impuesto
        ; }

    public void setNombre(String nombre) {
        if (nombre.matches(".*\\d.*") && nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede contener números.");
        }
        this.nombre = nombre;
    }

    public void setDescripcioString(String descripcioString) {
        if (descripcioString.isEmpty()) {
            throw new IllegalArgumentException("Porfavor ingrese una descripción.");
        }
        this.descripcioString = descripcioString;
    }

    public void setCodigo(String codigo) {
        if (!codigo.matches("\\d{10}")) {
            throw new IllegalArgumentException("El código debe debe tener 10 dígitos.");
        }
        this.codigo = codigo;
    }

    public void setTipoString(String tipoString) {
        if (tipoString.isEmpty()) {
            throw new IllegalArgumentException("Por favor, ingrese un tipo.");
        }
        this.tipoString = tipoString;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("Ingrese un precia mayor a 0.");
        }
        this.precio = precio;
    }

    public void setImpuesto
    (double impuesto
    ) {
        if (impuesto
         < 0) {
            throw new IllegalArgumentException("El impuesto no puede ser negativo.");
        }
        this.impuesto
         = impuesto
        ;
    }
}