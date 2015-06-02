package why

/**
 * @author	kostas.kougios
 *            Date: 31/05/15
 */
object CollectionsScala extends App
{
	// scala summing of numbers is much better.
	// it is achieved via implicit num: Numeric[B] which
	// is passed on automatically by the compiler.
	val sum = List(1, 2, 3).sum
}
