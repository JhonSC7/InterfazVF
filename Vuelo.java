public class Vuelo {

    package modelo;

    public class Vuelo {
        private String destino;
        private int cuposDisponibles;


        public Vuelo(String destino, int cupos) {
            this.destino = destino;
            this.cuposDisponibles = cupos;
        }

        public String getDestino() {
            return destino;
        }

        public int getCuposDisponibles() {
            return cuposDisponibles;
        }

        public boolean reservar() {
            if (cuposDisponibles > 0) {
                cuposDisponibles--;
                return true;
            }
            return false;
        }

        public boolean comprar() {
            return reservar(); // mismo comportamiento
        }

        @Override
        public String toString() {
            return destino + " - Cupos: " + cuposDisponibles;
        }
    }

