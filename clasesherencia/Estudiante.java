    public class Estudiante extends Persona {
        private String carrera;
        private int codigoCarrera;
    
        public Estudiante() {
    
        }
    
        public Estudiante(String nombre, int edad, String carrera , int codigoCarrera) {
            super(nombre, edad);
            this.carrera = carrera;
            this.codigoCarrera = codigoCarrera;
        }
    
        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }
    
        public String getCarrera() {
            return carrera;
        }
    
        public void setCodigoCarrera(int codigoCarrera) {
            this.codigoCarrera = codigoCarrera;
        }
    
        public int getCodigoCarrera() {
            return codigoCarrera;
        }
        public int getLegajo() {
            return legajo;
            }
        public void setLegajo(int val) {
            this.legajo = val;
        }
    
    }
    

