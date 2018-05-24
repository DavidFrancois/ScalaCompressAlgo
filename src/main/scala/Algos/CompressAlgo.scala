package Algos

class CompressAlgo(var input: String) {

  def RLE() = (1 until input.size)
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
}
