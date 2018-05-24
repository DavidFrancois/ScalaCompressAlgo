import Algos.CompressAlgo
import org.scalatest.FunSuite

class RLETest extends FunSuite {
  var compAlg = new CompressAlgo()

  test("Simple case") {
    assert(compAlg.RLE("TTTTOOOOTTTTOOOO") == "4T4O4T4O")
  }
}
