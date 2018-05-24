package Algos

class CompressAlgo(var input: String) {

  def RLE() = (1 until input.size)
    .foldLeft((1, new StringBuilder)) {
      case ((count, sb), idx) =>
        if (idx == input.size || input(idx - 1) != input(idx)) {
          sb.append(count)
          sb.append(input(idx - 1))
          (1, sb)
        } else {
          (count + 1, sb)
        }
    } match {
    case (count, sb) => sb.toString()
  }
}
