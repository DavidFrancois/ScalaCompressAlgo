package Algos

class CompressAlgo() {

  def RLE(input: String) = (1 until input.size)
    .foldLeft((1, new StringBuilder)) {
      case ((count, sb), idx) =>
        if (input(idx - 1) != input(idx)) {
          if (count > 1) sb.append(count)
          sb.append(input(idx - 1))
          (1, sb)
        } else {
          (count + 1, sb)
        }
    } match {
    case (count, sb) =>
      if (count > 1) sb.append(count)
      sb.append(input.last)
      sb.toString()
  }

  def genFreqMap(input: String) = input
    .foldLeft(Map[Char, Int]()) {
      (map, c) =>
        if (map.isDefinedAt(c)) (map + (c -> (map(c) + 1)))
        else (map + (c -> 1))
    }

//  def Huffman(input:String)
}
