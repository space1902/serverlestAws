# Proyecto Base Java con Layer AWS

La idea del proyecto es tener un proyecto Java base donde se encuentren todas las dependencias y estas se hereden por medio del `parent` del proyecto principal a los proyectos hijos.

A su vez, se va a trabajar un **layer en AWS** que contendrá todas las utilidades compartidas de las diferentes lambdas, donde se encontrará la lógica de los diferentes endpoints y procesos que se necesiten para el proyecto.

## Estructura del Proyecto

1. **Proyecto Base**: 
   - Este proyecto contendrá todas las dependencias comunes que serán heredadas por los proyectos hijos.
   
2. **Layer en AWS**:
   - El layer contendrá las utilidades compartidas y la lógica que será utilizada por diferentes lambdas.
   - Los endpoints y procesos serán implementados dentro de este layer para facilitar el mantenimiento y la reutilización de código.

## Objetivo

Este enfoque permitirá centralizar las dependencias y lógica común, promoviendo la reutilización y simplificando la gestión de las lambdas en AWS.

