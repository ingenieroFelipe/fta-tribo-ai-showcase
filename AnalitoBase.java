package cl.tribologia.model;

public abstract class AnalitoBase implements Trazable {
    private String idMuestra;
    private String fecha;
    private String equipoId;
    private String componente;
    private double volumenCombustible;

    public AnalitoBase(String idMuestra, String fecha, String equipoId, String componente, double volumenCombustible) {
        if (idMuestra == null || idMuestra.isBlank()) {
            throw new IllegalArgumentException("El ID de muestra no puede estar vacío.");
        }
        if (equipoId == null || equipoId.isBlank()) {
            throw new IllegalArgumentException("El ID del equipo es obligatorio.");
        }
        if (volumenCombustible <= 0) {
            throw new IllegalArgumentException("El volumen de combustible debe ser mayor a cero.");
        }
        this.idMuestra = idMuestra.trim();
        this.fecha = fecha;
        this.equipoId = equipoId.trim();
        this.componente = componente;
        this.volumenCombustible = volumenCombustible;
    }

    public abstract double calcularIndiceSeveridad();

    public String getIdMuestra() { return idMuestra; }
    public String getFecha() { return fecha; }
    public String getEquipoId() { return equipoId; }
    public String getComponente() { return componente; }
    public double getVolumenCombustible() { return volumenCombustible; }
}