# FTA Tribo-AI | Arquitectura Predictiva & Ferrografía (ASTM D7690)

> **Repositorio de Arquitectura Pública (Showcase)** — El motor completo de reglas metalúrgicas, algoritmos de normalización por relleno de aceite y persistencia LIMS reside en un repositorio privado bajo propiedad intelectual de **Felipe Tamayo Almonacid**.

## Contexto del Problema Industrial
En la gran minería, el muestreo tradicional de lubricantes por horas reloj (250/500 hrs) ignora la severidad térmica real de operación de los camiones de extracción (**CAEX**). Además, la espectrometría ICP (< 5 µm) presenta una zona ciega frente a partículas de fatiga laminar (> 10 µm).

**FTA Tribo-AI** resuelve esta brecha mediante:
* **Muestreo Dinámico por Volumen de Combustible:** Correlación directa entre energía térmica consumida y degradación del lubricante.
* **Cruce ICP vs. Índice PQ / ASTM D7690:** Detección temprana de desgaste severo en mandos finales y motores diésel.

## Stack & Patrones de Diseño (Java 21)
* **Interfaz Gráfica:** JavaFX + FXML (Patrón MVC).
* **Modelamiento Orientado a Objetos:** Polimorfismo y abstracción mediante contratos (`Trazable`) y jerarquía de analitos (`AnalitoBase`).
* **Persistencia:** Patrón DAO + Repository con serialización JSON (`Gson`) y escritura atómica (`ATOMIC_MOVE`).

## Contacto & Demostraciones Comerciales
* **Autor:** Felipe Tamayo Almonacid — Especialista en Tribología Aplicada & Desarrollo Java
* **Contacto:** felipe.tamayo.almonacid@gmail.comyo Almonacid
* **Teléfono:** +56977740381