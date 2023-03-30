# Práctica principios SOLID

## Principios SOLID no cumplidos por el código

  He detectado en el código que no se cumplen los siguientes principios:

**Principio de Responsabilidad Única**

  El código incumplía este principio debido a que varias clases implementaban métodos
  que desde mi punto de vista no se correspondian con la función del método.
  Para solucionarlo he creado otras clases como por ejemplo FileReader o FileConverter
  que implementan los métodos necesarios.
  
**Principio de Segregación de Interfaces**

  El código incumplía este principio ya que la clase abstracta implementaba una interfaz
  con muchos métodos, los cuales desde mi punto de vista no deberian estar todos en la 
  clase abstracta.
  Para solucionarlo he creado varias interfaces con métodos más especificos, y a cada
  clase le he implementado las interfaces que he creido conveniente.
  Esto está muy relacionado con el principio de responsabilidad única.
  
**Principio de Inversión de Dependencias**

  Posiblemente esté equivocado con este principio porque me genera dudas.
  Desde mi punto de vista se incumple este principio debido a que el código tenía una
  clase abstracta que implementaba una interfaz, y las clases "hijas" de esta clase
  abstracta están ligadas a esa interfaz.
  Para solucionarlo he quitado la interfaz a la clase abstracta y he implementado las 
  interfaces correspondientes a las clases "hijas" y estas son las que extienden de la clase "madre".

**A las interfaces nuevas creadas las he nombrado con una "I" delante para que sean más sencillas de localizar.**

