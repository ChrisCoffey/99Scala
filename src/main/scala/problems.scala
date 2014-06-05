
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

  def dropNth[A](n: Int, lst: List[A]): List[A] ={
    def go(i:Int, l: List[A], acc: List[A]): List[A] = {
      l match{
        case h :: t if i == 1 => go(n, t, acc)
        case h :: t => go(i-1, t, h :: acc)
        case _ => reverse(acc)
      }
    }
    go(n, lst, List[A]())
  }

  def splitAt[A](n: Int, lst: List[A]): (List[A], List[A]) =
    lst.zipWithIndex.foldRight((List[A](), List[A]())){(a, acc) =>
      if(a._2 < n) (a._1 :: acc._1, acc._2) else (acc._1, a._1 :: acc._2)
    }

  def takeSlice[A](x: Int, y: Int, lst: List[A]): List[A] =
    lst.drop(x).take(y-x)

  def rotateLeft[A](n: Int, lst: List[A]): List[A] =
    n match{
      case x if x < 0 => lst.takeRight(n * -1) ::: lst.dropRight(n * -1)
      case _ => lst.drop(n) ::: lst.take(n)
    }

  //This is lower level than the textbook answer... I really like this version:
//  def removeAt[A](n: Int, ls: List[A]): (List[A], A) = ls.splitAt(n) match {
//    case (Nil, _) if n < 0 => throw new NoSuchElementException
//    case (pre, e :: post)  => (pre ::: post, e)
//    case (pre, Nil)        => throw new NoSuchElementException

  def removeNth[A](n: Int, lst: List[A]): (List[A], A) =
    lst.zipWithIndex.foldRight((List[A](), lst.head)){(a, acc) =>
      a match{
        case (x, y) if y == n => (acc._1, x)
        case (x, y) => (x :: acc._1, acc._2)
    }}
}
