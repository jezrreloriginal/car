fun main(args: Array<String>) {
  class Carro {
  var marca = ""
  var modelo = ""
  var ano = 0
 }  
val fusca = Carro()

fusca.marca = "taunner"
fusca.modelo = "pobre"
fusca.ano = 2001

println(fusca.marca)  
println(fusca.modelo)  
println(fusca.ano)    

val  gol = Carro()
gol.marca = "gol"
gol.modelo = "quadrado"
gol.ano = 1950

val parati = Carro()
parati.marca = "ferrari"
parati.modelo = "black"
parati.ano = 2004

println(parati.marca)  
println(parati.modelo) 
println(parati.ano)

println(gol.marca)  
println(gol.modelo) 
println(gol.ano)
}