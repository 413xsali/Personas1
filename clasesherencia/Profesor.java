public class Profesor extends  Persona {

        private String materia;
        private String cargo;
    
        public Profesor() {
    
        }
    
        public Profesor(String nombre, int edad, String materia, String cargo) {
            super(nombre, edad);
            this.materia = materia;
            this.cargo = cargo;
        }
    
        public void setMateria(String materia) {
            this.materia = materia;
        }
    
        public String getMateria() {
            return materia;
        }
    
        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
    
        public String getCargo() {
            return cargo;
        }
    
    
    
    }
    
    

