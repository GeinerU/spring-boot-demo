Descripción del Proyecto: Internacionalización en una Aplicación Spring Boot
Objetivo
El propósito de este proyecto es incorporar la funcionalidad de internacionalización en una aplicación desarrollada con Spring Boot. La aplicación adapta los mensajes que muestra, cambiando entre inglés y español según el idioma solicitado en la petición, sin necesidad de modificar el código base.

Pasos Clave en la Implementación
    1. Creación de Archivos de Mensajes­
Se generaron dos archivos .properties para almacenar los mensajes en los dos idiomas:
        ◦ messages_en.properties (para el inglés)
        ◦ messages_es.properties (para el español)
    2. Configuración de Spring para Internacionalización
Se configuró la aplicación para que Spring Boot gestione los mensajes según el idioma solicitado. Esto incluyó ajustar la codificación UTF-8 y establecer un idioma por defecto cuando no se especificaba ninguno en la solicitud.
    3. Desarrollo del Controlador
Se implementó un endpoint /saludo en el controlador que devuelve el mensaje adecuado según el idioma recibido en la petición.

Dificultades y Soluciones
    1. Problemas con los Archivos de Mensajes
En un principio, los archivos de mensajes no se cargaban correctamente. Esto se solucionó al verificar que los archivos estuvieran ubicados en la carpeta resources del proyecto.
    2. Manejo del Idioma Predeterminado
Al no especificar un idioma en la solicitud, la aplicación no sabía cuál usar. El problema se resolvió configurando un idioma predeterminado y asegurando que la codificación UTF-8 fuera la correcta.

