
object Problems {
  def last[A](lst: List[A]) = lst.reverse.head

  def penultimate[A](lst: List[A]) = {
    lst.reverse match{
      case h :: t => t.head
      case h :: Nil => h
    }
  }

  def nth[A](lst: List[A], n: Int): A = {
    lst match{
      case h :: t if n == 0 => h
      case h :: t => nth(t, n-1)
      case h :: Nil => h
    }
  }

  def count[A](lst: List[A]) = lst.foldRight(0)((a, acc) => acc +1)

  def reverse[A](lst: List[A]) = lst.foldLeft(List[A]())((acc, a) => a :: acc)

  def isPalindrome[A](lst: List[A]) = lst == reverse(lst)

  def flatten(lst: List[Any]) : List[Any] = lst flatMap {
    case l: List[_] => flatten(l)
    case e => List(e)
  }

  def compress[A](lst: List[A]): List[A] = {
    lst.foldRight(List[A]()){(a, acc) =>
      acc match{
        case h :: _ if a == h => acc
        case _ => a :: acc
    }}
  }

  def pack[A](lst: List[A]): List[List[A]] =
    lst.foldRight(List[List[A]]()){(a, acc) =>
    acc match{
      case h :: tt if a == h.head => (a :: h) :: tt
      case _ => List(a) :: acc
    }}

  def runLengthEncodePack[A](lst: List[A]): List[(Int, A)] =
    pack(lst).map(l => (l.length, l.head))

  def runLengthEncode[A](lst: List[A]): List[(Int, A)] =
    lst.foldRight(List[(Int, A)]()){(a, acc) =>
      acc match{
        case h :: tt if a == h._2 => (h._1 +1, a) :: tt
        case _ => (1, a) :: acc
      }
    }

  //rewrote to use previous calls. reuse, duh
  def runLengthEncodeMod[A](lst: List[A]): List[Any] =
    runLengthEncode(lst).map(n => if(n._1 == 1) n._2 else n)

  def decodeEncoded[A](lst: List[(Int, A)]): List[Any] =
    flatten(lst.map(n => List.fill(n._1)(n._2)))

  def doubleElements[A](lst: List[A]) : List[A]=
    lst.foldRight(List[A]()){(a, acc) => a :: a :: acc}

  def duplicate[A](n: Int, lst:List[A]): List[A] =
    lst.foldRight(List[A]()){(a, acc)=> List.fill(n)(a) ::: acc}

}
