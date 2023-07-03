fun main() {
   print("Escreva a Idade: ")
   val age = readLine()?.toIntOrNull()?:return

   if (age >= 18){
      println("Você é maior de idade.")
   } else{
      println("Voce é menor de idade.")
   }

}