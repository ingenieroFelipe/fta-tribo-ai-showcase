package cl.tribologia.model;

public interface Trazable {
    boolean requiereFerrografia();
    String obtenerDiagnostico();
    String getNivelCriticidad();
}