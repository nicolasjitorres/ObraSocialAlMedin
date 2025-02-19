# 🏷️ Proyecto Obra Social - Java + React + Quarkus

## ✨ Introducción
Este proyecto es el trabajo integrador del grupo 9 en la academia Java + React 2024 de UMSA con Softtek. Modela una obra social con afiliados, especialistas, turnos y recetas médicas. Cuenta con una API documentada en Swagger y un frontend para su uso.

## 👥 Integrantes
- **Javier Kuznik**
- **Nicolas Torres**
- **Joaquin Muñoz**

## 🔧 Tecnologías
### Backend (👨‍💻 Java + Quarkus)
- **Java 17** + **Quarkus**
- **Maven** para gestión de dependencias
- **H2** como base de datos en memoria
- **Swagger** para documentación

### Frontend (💻 React + TypeScript)
- **React**, **TypeScript**, **Redux** y **Material-UI**
- **Vite** para construcción rápida
- **Axios** para peticiones HTTP
- **Yup**, **SweetAlert2**, **JSPDF** y **Date-fns**

## 📚 Entidades
- **Afiliados**
- **Especialistas**
- **Turnos**
- **Recetas médicas**
- **Ubicaciones de especialistas**
- **Horarios**

## ⚡ Instalación y Ejecución
### Backend
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/nicolasjitorres/UMSA_grupo_9.git
   ```
2. Iniciar Quarkus:
   ```bash
   ./mvn compile quarkus:dev
   ```
3. Probar API en:
   - [Postman](https://github.com/nicolasjitorres/UMSA_grupo_9/blob/develop/BackendSofftek/obrasocial.postman_collection.json)
   - [Swagger UI](http://localhost:8080/swagger-ui/index.html#/)

### Frontend
1. Ir al directorio del frontend:
   ```bash
   cd frontend
   ```
2. Instalar dependencias:
   ```bash
   npm install
   ```
3. Ejecutar la app:
   ```bash
   npm run dev
   ```

## 🔄 Funcionalidades
- **Gestíon de Afiliados, Especialistas, Turnos y Recetas**
- **Inicio de sesión (visual, sin JWT por ahora)**
- **Generación de recetas en PDF**
- **Filtros y validaciones en formularios**
- **Interfaz amigable con Material-UI**

## 📢 Contacto
Cualquier duda o sugerencia, contáctanos.

🎉 ¡Gracias por visitar nuestro proyecto FullStack de la Obra Social Almedin! 🎉

