package why

import java.io.{Closeable, FileInputStream}

/**
 * @author	kostas.kougios
 *            Date: 30/05/15
 */
object TryWithResources
{
	def tryWithResources[T <: Closeable, R](closeable: T)(f: T => R): R = {
		try {
			f(closeable)
		} finally {
			closeable.close()
		}
	}
}

object UseTryWithResources extends App
{

	import TryWithResources._

	val data = tryWithResources(new FileInputStream("/tmp/x"))(_.read)
	println(data)
}