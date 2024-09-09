
# Algoritmo para Generar CURP y RFC

Este proyecto es una implementación en Java para generar el **CURP** (Clave Única de Registro de Población) y el **RFC** (Registro Federal de Contribuyentes) a partir de los datos personales ingresados por el usuario. El CURP es utilizado en México para identificar a cada ciudadano de manera única, mientras que el RFC se utiliza para fines fiscales.

## Tabla de Contenidos

- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

## Instalación

1. Clona este repositorio a tu máquina local utilizando el siguiente comando:

   ```bash
   git clone https://github.com/Ppybad/AlgoritmoCurpYRFCpfjava.git
   ```

2. Abre el proyecto en tu IDE preferido (Eclipse, IntelliJ, NetBeans, etc.).

3. Asegúrate de tener instalado **Java JDK 8** o superior.

4. Compila y ejecuta el programa utilizando las herramientas de tu entorno de desarrollo.

## Uso

Para generar la CURP y RFC, el programa solicitará la siguiente información del usuario:

- **Nombre completo** (Nombre(s), Apellido Paterno, Apellido Materno)
- **Fecha de nacimiento** (día, mes, año)
- **Sexo** (Hombre o Mujer)
- **Entidad federativa de nacimiento**
  
Una vez ingresados estos datos, el programa generará y mostrará el **CURP** y **RFC** correspondientes.

### Ejemplo de uso

```
Ingrese su nombre: Juan
Ingrese su apellido paterno: Pérez
Ingrese su apellido materno: García
Ingrese su fecha de nacimiento (DD/MM/AAAA): 15/05/1990
Ingrese su sexo (H/M): H
Ingrese su entidad federativa de nacimiento: Ciudad de México
```

Salida:

```
CURP: PEGJ900515HDFRNN02
RFC: PEGJ9005151H0
```

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

```bash
├── src/
│   ├── Main.java           # Archivo principal que ejecuta el programa
│   ├── CurpGenerator.java  # Lógica para generar el CURP
│   ├── RfcGenerator.java   # Lógica para generar el RFC
│   └── Utils.java          # Funciones de utilidad para validación y procesamiento de datos
├── README.md               # Este archivo
└── LICENSE                 # Archivo de licencia
```

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor sigue los siguientes pasos:

1. Haz un fork de este repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commits (`git commit -m 'Agrega nueva funcionalidad'`).
4. Sube tus cambios (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT. Puedes consultar más detalles en el archivo [LICENSE](./LICENSE).
