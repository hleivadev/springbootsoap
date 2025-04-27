# 📦 Spring Boot SOAP Client - Calculator API

Este proyecto es un **cliente SOAP** construido con **Spring Boot 3.4.5**, **Java 17**, y **Maven**, que consume un servicio web SOAP público de operaciones matemáticas básicas.

---

## 🚀 ¿Qué hace este proyecto?

- Consume el [Calculator Web Service](http://www.dneonline.com/calculator.asmx?WSDL).
- Realiza operaciones como:
  - **Suma (`Add`)**
  - *(Próximamente podrías agregar Subtract, Multiply, Divide)*
- Envía peticiones SOAP utilizando `WebServiceTemplate` de Spring.
- Código generado automáticamente desde el WSDL.
- Compatible con **Jakarta XML Binding** (`jakarta.xml.bind.annotation`).

---

## 📋 Tecnologías usadas

- Java 17 (Amazon Corretto recomendado)
- Spring Boot 3.4.5
- Spring Web Services
- Maven 3.9.5+
- JAXB (Jakarta XML Binding API 3.0.1)

---

## 🛠️ Cómo levantar el proyecto

1. Clona el repositorio:

```bash
git clone https://github.com/hleivadev/springbootsoap.git
cd springbootsoap
