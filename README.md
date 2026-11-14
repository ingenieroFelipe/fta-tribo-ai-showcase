# ⚙️ Tribopedia (FTA Tribo-AI)

> **Motor Diagnóstico Industrial de Alta Gama para Mantenimiento Predictivo y Análisis de Tribología.**

---

## 📌 Visión General del Proyecto
**Tribopedia** es una solución de software orientada a la ingeniería de confiabilidad y la gestión de activos industriales (minería, transporte y maquinaria pesada). Su objetivo principal es transformar los datos dispersos de laboratorio de aceites usados en **diagnósticos automáticos de causa raíz**, integrando variables físico-químicas complejas y metadatos operativos para lograr una **reducción estimada superior al 40% en costos de mantenimiento preventivo y correctivo**.

---

## 🛠️ Stack Tecnológico
* **Lenguaje:** Java 21 (Clean Code, Programación Orientada a Objetos y Principios SOLID).
* **Interfaz Gráfica:** JavaFX (Diseño UI moderno bajo identidad corporativa industrial).
* **Control de Versiones:** Git / GitHub.
* **Arquitectura:** Diseño modular basado en jerarquías polimórficas para el procesamiento de analitos.

---

## 🔬 Arquitectura del Motor Analítico
El núcleo del sistema (`TribopediaEngine`) implementa un **Motor de Reglas Cruzadas** que correlaciona de manera síncrona:
1. **Matriz Físico-Química:** Viscosidad cinemática (40°C y 100°C), Número de Base Total (TBN), Número de Acidez Total (TAN), Contenido de Hollín, Dilución por Combustible, Agua (Karl Fischer) y Sílice.
2. **Metales de Desgaste & Contaminación:** Seguimiento de elementos críticos (Fe, Cu, Pb) y el Índice de partículas ferrosas (**PQ Index**), integrando estándares normativos como **ASTM D7690** para morfología de partículas.
3. **Contexto Operativo:** Horas de aceite, volumen de estanque, modelo de equipo y severidad de operación.

---

## 🚀 Características Principales
* **Jerarquía Polimórfica Robusta:** Clases base abstractas (`AnalitoBase`) extendidas por especializaciones (`MetalDesgaste`, `ContaminanteQuimico`) para evitar redundancias y facilitar la escalabilidad.
* **Cálculo Automático de Severidad (ISV):** Ponderación algorítmica para determinar umbrales de alerta (*Normal, Precaución, Crítico*).
* **Evaluación de Necesidad de Ferrografía:** Disparadores automáticos basados en umbrales combinados de PQ Index y metales ferrosos.
* **Métrica de Impacto Financiero (ROI):** Estimación de ahorro monetario por activo evaluado.

---

## 📂 Estructura del Repositorio (Muestra de Código)
```text
fta-tribo-ai-showcase/
│
├── src/main/java/cl/tribologia/
│   ├── App.java                   # Punto de entrada de la aplicación JavaFX
│   ├── Launcher.java              # Lanzador principal
│   ├── controller/                # Controladores de la interfaz gráfica (UI)
│   ├── engine/                    # Motor de reglas cruzadas y diagnóstico
│   ├── model/                     # Jerarquía de clases (AnalitoBase, MetalDesgaste, etc.)
│   └── dao/ & repository/         # Capas de persistencia y acceso a datos
│
└── src/main/resources/cl/tribologia/view/
    └── main-view.fxml             # Definición de la interfaz de usuario corporativa
