class Persona {
    private String nombre,apellido;
    private int edad;
    private double altura;

        public void mostrarNombre(){
          System.out.println("Hola soy" + this.nombre);
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
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            if (edad>0) {
                this.edad = edad;
            } else {
                System.out.println("edad invalidad");
            }
           
        }
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            if (altura>0) {
                this.altura = altura;  
            } else {
                System.out.println("altura invalidad");
            }
            
        }
        @Override
        public String toString() {
            return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura
                    + "]";
        }
        public void mostrarApellido(){
            System.out.println("Mi apellido es" + this.apellido);
        }
        public void mostrarEdad(){
            System.out.println ("Mi edad es:" + this.edad);
        }
        public void mostrarAltura(){
            System.out.println ("Mi altura es:" + this.altura);
    
}
}