object week5ex{
  def greet1( x:String) : String =( "Hello "+x+ "How U doing")
  def frame(x: String, f: String=>):string=
  {f(x)

  }
  val outcome=frame("Richerd" , greet1)
  print(outcome)
}



val names = List("Alice", "Nick", "Martin", "Bob")
for (name <- names) {println(name)}
val names2 = names.map( (name: String) => {name.reverse})
for (name <- names2) {println(name)}

val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
val sum = nums.reduce( (x: Int, y: Int) => x + y)
println(sum)

val oddNums = nums.filter( (x: Int) => x%2 != 0)
for (n <- oddNums)
{println(n)}

println(names.map(_.toUpperCase))
println(names.flatMap(_.toUpperCase))

val list = List(1,2,3,4,5)
def g(v:Int) = List(v-1, v, v+1)
list.map(x => g(x))
list.flatMap(x => g(x))