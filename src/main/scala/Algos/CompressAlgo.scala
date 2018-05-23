package Algos

class CompressAlgo(var input: String) {

  def RLE() = (1 until this.input.size)
    .foldLeft(new StringBuilder) {
      case (sb, idx) => {
        sb.append(idx)
      }
    }
}
