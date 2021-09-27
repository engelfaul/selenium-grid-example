# language: es

Característica: Busquedas en Wikipedia

  @docker0
  Escenario: Buscar en Wiktionary
    Dado Camilo es un usuario de wikipedia
    Cuando el se dirige a la opción de Wiktionary
    Y el busca en el diccionario automation
    Entonces el puede ver el resultado de la busqueda automation

  @docker1
  Escenario: Buscar en Wikipedia
    Dado Camilo es un usuario de wikipedia
    Cuando el busca selenium
    Y el selecciona la opción Selenium (software)
    Entonces el puede ver el resultado de la busqueda Selenium (software)

  @docker2
  Escenario: Buscar en Wikipedia y acceder a un link
    Dado Camilo es un usuario de wikipedia
    Cuando el busca selenium
    Y el selecciona la opción Selenium (software)
    Entonces el puede ver el resultado de la busqueda Selenium (software)

  @docker3
  Escenario: Linkear una pagina desde otra en wikipedia
    Dado Camilo es un usuario de wikipedia
    Cuando el busca docker
    Y el selecciona la opción Docker (software)
    Y el selecciona la opción DevOps
    Entonces el puede ver el resultado de la busqueda DevOps