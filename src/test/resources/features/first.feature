#autor :Carlos Enrique Quintero Simití
  #language: es

  @HistoriaDeUsuario
  Característica: Añadir un nuevo candidato en la funcionalidad Recruitment

    Yo como usuario administrador, quiero añadir un nuevo candidato en la funcionalidad Recruitment de la pagina opensource-demo.orangehrmlive.com


  @CasoAñadirCandidato
    Escenario: Añadir un nuevo candidato

    Dado que el usuario acceda a la pagina orangehrmlive.com
    Y utilice el rol administrador para iniciar sesión
      |usuario|contraseña|
      |Admin  |admin123  |

    Cuando el usuario ingrese al módulo Recruitment y de click en el boton Add
    Y complete los campos requeridos y haga click en el botón guardar
      |nombre     |segundo_nombre|apellido|vacante    |email      |numero_de_contacto |palabras_clave    |fecha_de_aplicacion  |notas|
      |Leonardo|Alberto       |Di Caprio      |Senior QA Lead|leo.example123@example.com|62222244|Practivo, Honesto|2024-23-04|Esto es un ejemplo de notas|
    Entonces se valida la existencia del nuevo candidato

