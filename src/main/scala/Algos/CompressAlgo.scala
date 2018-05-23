package Algos

class CompressAlgo(var input: String) {

  def RLE() = (1 until this.input.size)
    .foldLeft((1, new StringBuilder(this.input(0).toString))) {
      (acc, idx) =>
          if (input(idx - 1) == this.input(idx)) (acc._1 + 1, acc._2)
          else  {
            acc._2.append(acc._1, this.input(idx))
            (1, acc._2)
        }
    }
}
