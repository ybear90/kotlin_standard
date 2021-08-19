// Declaring a nullable variable

class Person(val first: String,
			 val middle: String?,
			 val last: String)

val jkRowling = Person("Joanne", null, "Rowling")
val northWest = Person("North", null, "West")

// Checking nullability of a val variable

val p = Person(first = "North", middle = null, last = "West")
if (p.middle != null) {
	val middleNameLength = p.middle.length
}
