fun main(args: Array<String>) {
  println("Unlocking Potential")
   
  //1. Creating a basic for loop
  for(i in 1..10) {
    println("$i: Unlocking Potential")
  }
  
  //2. Creating a function that takes a String as an argument
  fun unlockPotential(name:String) {
    println("$name is Unlocking Potential")
  }
  
  //3. Calling the function with different arguments
  unlockPotential("John")
  unlockPotential("Mary")
  unlockPotential("Lilly")
  
  //4. Creating an array of Strings
  val names = arrayOf("John", "Mary", "Lilly", "Sam", "Chris")
  
  //5. Using a for loop to print each element of names array
  for(name in names) {
    println("$name is Unlocking Potential")
  }
  
  //6. Creating a while loop
  var i = 0
  while(i < 5) {
    println("${names[i]} is Unlocking Potential")
    i++
  }
  
  //7. Creating a global boolean variable
  var potentialUnlocked = false
  
  //8. Creating a do/while loop
  do{
    println("Someone is Unlocking Potential")
    potentialUnlocked = true
  }while (potentialUnlocked == false)
  
  //9. Creating a HashMap
  val studentMap = hashMapOf(
    "John" to "Engineering",
    "Mary" to "Art History",
    "Lilly" to "Mathematics"
  )
  
  //10. Printing out the contents of the HashMap
  for((name, major) in studentMap) {
    println("$name is Unlocking Potential in $major")
  }
  
  //11. Creating a when expression
  val major = when (studentMap["John"]) {
    "Engineering" -> "John is Unlocking Potential in Engineering"
    "Art History" -> "Mary is Unlocking Potential in Art History"
    "Mathematics" -> "Lilly is Unlocking Potential in Mathematics"
    else -> "Someone is Unlocking Potential"
  }
  println(major)
  
  //12. Creating a List of Ints
  val numbers = listOf(1,2,3,4,5)
  
  //13. Using functional programming to double each number in the list
  val doubledNumbers = numbers.map {it * 2}
  
  //14. Printing out the numbers in the doubledNumbers list
  for(number in doubledNumbers) {
    println("Doubling Potential: $number")
  }
  
  //15. Creating a mutable list of Strings
  val students = mutableListOf("John", "Mary", "Lilly")
  
  //16. Adding another element to the list
  students.add("Sam")
  
  //17. Printing out the elements in the students list
  for(student in students) {
    println("$student is Unlocking Potential")
  }
  
  //18. Creating a custom class
  class Student(val name: String, val major: String, var gpa: Double)
  
  //19. Creating an object from the Student class
  val john = Student("John", "Engineering", 3.8)
  
  //20. Printing out the object details
  println("${john.name} is Unlocking Potential in ${john.major} with a GPA of ${john.gpa}")
  
  //21. Creating a generic function
  fun <T> unlockPotentialGeneric(input: T) {
    println("$input is Unlocking Potential")
  }
  
  //22. Calling the function with different data types
  unlockPotentialGeneric("John")
  unlockPotentialGeneric(10)
  unlockPotentialGeneric(3.14)
  
  //23. Creating a try/catch block
  try {
    val x = 20
    val y = 0
    println(x/y)
  } catch (e: Exception) {
    println("Error: Unlocking Potential is not possible")
  }
  
  //24. Creating a reference to a function
  val unlockPotentialFunctionReference: (Int) -> Unit = ::unlockPotential
  
  //25. Calling the function reference with an argument
  unlockPotentialFunctionReference(5) 
  
  //26. Creating a lambda function
  val unlockPotentialLambdaFunction: (String) -> Unit = { name -> 
    println("$name is Unlocking Potential")
  }
  
  //27. Calling the lambda function with an argument
  unlockPotentialLambdaFunction("Lilly")
  
  //28. Creating a Stream
  val numbersStream = (1..10).toList().stream()
  
  //29. Using the Stream to filter out odd numbers
  val evenNumbersStream = numbersStream.filter { it % 2 == 0 }
  
  //30. Printing out the even numbers
  evenNumbersStream.forEach { println("Unlocking Potential with $it") }
  
  //31. Creating an infinite stream
  val infiniteStream = generateSequence(2) {it + 2}
  
  //32. Taking only 10 elements from the stream using take()
  val firstTenElements = infiniteStream.take(10).toList()
  
  //33. Printing out the first ten elements
  firstTenElements.forEach { println("Unlocking Potential with $it") }
  
  //34. Creating a Co-routine
  suspend fun unlockPotentialCoroutine() {
    println("Someone is Unlocking Potential")
  }
  
  //35. Calling the Co-routine
  unlockPotentialCoroutine()
  
  //36. Creating an extension function
  fun String.printWithPotential() {
    println("$this is Unlocking Potential")
  }
  
  //37. Calling the extension function
  "John".printWithPotential()
  
  //38. Creating an interface
  interface UnlockPotentialInterface {
     fun printNameAndMajor(name: String, major: String)
  }
  
  //39. Creating an implementation of the interface
  class UnlockPotentialInterfaceImplementation: UnlockPotentialInterface {
    override fun printNameAndMajor(name: String, major: String) {
      println("$name is Unlocking Potential in $major")
    }
  }
  
  //40. Creating an object from the implementation
  val unlockPotentialInterfaceImplementation =
        UnlockPotentialInterfaceImplementation()
  
  //41. Calling the interface's method
  unlockPotentialInterfaceImplementation.printNameAndMajor("John", "Engineering")
  
  //42. Creating a sealed class
  sealed class UnlockPotentialSealedClass {
    class UnlockPotentialSuccess: UnlockPotentialSealedClass()
    class UnlockPotentialError: UnlockPotentialSealedClass()
  }
  
  //43. Creating an object from the sealed class
  val unlockPotentialSuccess = UnlockPotentialSealedClass.UnlockPotentialSuccess()
  
  //44. Using a when expression to match the object
  when(unlockPotentialSuccess) {
    is UnlockPotentialSealedClass.UnlockPotentialSuccess -> 
      println("Someone is Unlocking Potential")
    is UnlockPotentialSealedClass.UnlockPotentialError -> 
      println("Error: Unlocking Potential is not possible")
  }
  
  //45. Creating a data class
  data class StudentData(val name: String, val major: String, var gpa: Double)
  
  //46. Creating an object from the data class
  val studentData = StudentData("John", "Engineering", 3.8)
  
  //47. Printing out the object's details
  println("${studentData.name} is Unlocking Potential in ${studentData.major} with a GPA of ${studentData.gpa}")
  
  //48. Creating an object expression
  val unlockPotentialObjectExpression = object : UnlockPotentialInterface {
    override fun printNameAndMajor(name: String, major: String) {
      println("$name is Unlocking Potential in $major")
    }
  }
  
  //49. Calling the object expression's method
  unlockPotentialObjectExpression.printNameAndMajor("John", "Engineering")
  
  //50. Creating a singleton object
  object UnlockPotential {
    fun printMessage() {
      println("Someone is Unlocking Potential")
    }
  }
  
  //51. Calling the singleton object's method
  UnlockPotential.printMessage()
  
  //52. Creating an anonymous inner class
  val unlockPotentialAnonymousInnerClass = object : UnlockPotentialInterface {
    override fun printNameAndMajor(name: String, major: String) {
      println("$name is Unlocking Potential in $major")
    }
  }
  
  //53. Calling the anonymous inner class' method
  unlockPotentialAnonymousInnerClass.printNameAndMajor("John", "Engineering")
  
  //54. Creating a generic function
  fun <T> binarySearch(list: List<T>, target: T, comparator: Comparator<T>) {
    println("Searching for $target...")
  }
  
  //55. Calling the generic function
  binarySearch(listOf(1,2,3,4,5,6), 3, Comparator { o1, o2 -> o1 - o2 })
  
  //56. Creating a function taking a vararg
  fun unlockPotentialVararg(vararg names: String) {
    for(name in names) {
      println("$name is Unlocking Potential")
    }
  }
  
  //57. Calling the vararg function
  unlockPotentialVararg("John", "Mary", "Lilly")
  
  //58. Creating a function using infix notation
  infix fun Int.unlockPotential(name: String) = println("$name is Unlocking Potential with $this")
  
  //59. Calling the function using infix notation
  10 unlockPotential "John"
  
  //60. Creating a generic function accepting two types
  fun <T, R>unlockPotentialGeneric2(input1: T, input2: R) {
    println("$input1 and $input2 are Unlocking Potential")
  }
  
  //61. Calling the generic function
  unlockPotentialGeneric2(10, "John")
  
  //62. Creating a function returning a function
  fun unlockPotentialFunctionReturningFunction(name: String): () -> Unit {
    return {
      println("$name is Unlocking Potential")
    }
  }
  
  //63. Calling the function returning a function
  unlockPotentialFunctionReturningFunction("John")()
  
  //64. Creating a function accepting a function
  fun unlockPotentialFunctionAcceptingFunction(name: String, callback: () -> Unit) {
    println("$name is Unlocking Potential")
    callback()
  }
  
  //65. Calling the function accepting a function
  unlockPotentialFunctionAcceptingFunction("John") {
    println("John is Done Unlocking Potential")
  }
  
  //66. Creating a function with default parameter
  fun unlockPotentialFunctionDefaultParameter(name: String, message: String="Unlocking Potential") {
    println("$name is $message")
  }
  
  //67. Calling the function with default parameter
  unlockPotentialFunctionDefaultParameter("John")
  
  //68. Creating an operator function
  operator fun Int.unlockPotentialOperator(name:String) = println("$name is Unlocking Potential with $this")
  
  //69. Calling the operator function
  20 unlockPotentialOperator "John"
  
  //70. Creating an inline function
  inline fun unlockPotentialInlineFunction(name: String, callback: () -> Unit) {
    println("$name is Unlocking Potential")
    callback()
  }
  
  //71. Calling the inline function
  unlockPotentialInlineFunction("John") {
    println("John is Done Unlocking Potential")
  }
  
  //72. Creating an enum class
  enum class UnlockPotentialEnumClass {
    SUCCESS, ERROR
  }
  
  //73. Creating an object from the enum class
  val unlockPotentialEnumClass = UnlockPotentialEnumClass.SUCCESS
  
  //74. Using a when expression to match the object
  when(unlockPotentialEnumClass) {
    UnlockPotentialEnumClass.SUCCESS -> 
      println("Someone is Unlocking Potential")
    UnlockPotentialEnumClass.ERROR -> 
      println("Error: Unlocking Potential is not possible")
  }
  
  //75. Creating an annotation
  @Target(AnnotationTarget.FUNCTION)
  annotation class UnlockPotentialAnnotation
  
  //76. Creating a function with the annotation
  @UnlockPotentialAnnotation
  fun unlockPotentialAnnotationFunction(name: String) {
    println("$name is Unlocking Potential")
  }
  
  //77. Calling the function with the annotation
  unlockPotentialAnnotationFunction("John")
  
  //78. Creating a flow
  val numbersFlow = (1..10).asFlow()
  
  //79. Using the flow to filter out odd numbers
  val evenNumbersFlow = numbersFlow.filter { it % 2 == 0 }
  
  //80. Collecting the numbers from the flow
  evenNumbersFlow.collect { number ->
    println("Unlocking Potential with $number")
  }
  
  //81. Using withContext to switch coroutines
  withContext(Dispatchers.IO) {
    println("Someone is Unlocking Potential")
  }
  
  //82. Creating an abstract class
  abstract class UnlockPotentialAbstractClass {
    abstract fun printNameAndMajor(name: String, major: String)
  }
  
  //83. Creating a subclass
  class UnlockPotentialSubClass: UnlockPotentialAbstractClass() {
    override fun printNameAndMajor(name: String, major: String) {
      println("$name is Unlocking Potential in $major")
    }
  }
  
  //84. Creating an object from the subclass
  val unlockPotentialSubClass = UnlockPotentialSubClass()
  
  //85. Calling the subclass' method
  unlockPotentialSubClass.printNameAndMajor("John", "Engineering")
  
  //86. Creating a generic interface
  interface UnlockPotentialGenericInterface<T> {
    fun printMessage(input: T)
  }
  
  //87. Creating an implementation of the generic interface
  class UnlockPotentialGenericInterfaceImplementation:
    UnlockPotentialGenericInterface<String> {
    override fun printMessage(input: String)