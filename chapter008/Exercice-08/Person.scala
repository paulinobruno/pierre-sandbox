/**
Compile the Person and SecretAgent classes in Section 8.6, “Overriding Fields,”
on page 95 and analyze the class files with javap . How many name fields are
there? How many name getter methods are there? What do they get? (Hint:
Use the -c and -private options.)
  */

package Exercice_08

class Person (val name: String){
  override def toString = getClass.getName + "[name=" + name +"]"

}

/**

  * There are two name fields, one in Person class, and one in SecretAgent class.
  * There are two name getter methods, one in each class as well. The second one overrides the first.
  * They get/return corresponding name field from their class.
  *
  * Additionally, there is separate toString field and overrided toString method, which returns
  * that field.
  */

class SecretAgent(codename: String) extends Person(codename){

  override val name = "Secret"

  override val toString = "secret"
}