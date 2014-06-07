
trait TestData {
  val p1 = List(1, 1, 2, 3, 5, 8)
  val a1 = 8

  val p2 = List(1, 1, 2, 3, 5, 8)
  val a2 = 5

  val p3 = List(1, 1, 2, 3, 5, 8)
  val a3 = 2

  val p4 = List(1, 1, 2, 3, 5, 8)
  val a4 = 6

  val p5 = List(1, 1, 2, 3, 5, 8)
  val a5 = List(8, 5, 3, 2, 1, 1)

  val p6 = List(1, 2, 3, 2, 1)
  val a6 = true

  val p7 = List(List(1, 1), 2, List(3, List(5, 8)))
  val a7 = List(1, 1, 2, 3, 5, 8)

  val p8 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val a8 = List('a, 'b, 'c, 'a, 'd, 'e)

  val p9 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val a9 = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

  val p10 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val a10 = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  val p11 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val a11 = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

  val p12 = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  val a12 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  val p13 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val a13 = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  val p14 = List('a, 'b, 'c, 'c, 'd)
  val a14 = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

  val p15 = (3, List('a, 'b, 'c, 'c, 'd))
  val a15 = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

  val p16 = (3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val a16 = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

  val p17 = (3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val a17 = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

  val p18 = (3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val a18 = List('d, 'e, 'f, 'g)

  val p19a = (3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val a19a = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  val p19b = (-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val a19b = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

  val p20 =  (1, List('a, 'b, 'c, 'd))
  val a20 =  (List('a, 'c, 'd),'b)

  val p21 = ('new, 1, List('a, 'b, 'c, 'd))
  val a21 = List('a, 'new, 'b, 'c, 'd)

  val p22 = (4, 9)
  val a22 = List(4, 5, 6, 7, 8, 9)

  val p23 = (3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  val a23 = List('e, 'd, 'a)

  val p24 = (6, 49)
  val a24 = List(23, 1, 17, 33, 21, 37)

  val p25 = List('a, 'b, 'c, 'd, 'e, 'f)
  val a25 = List('b, 'a, 'd, 'c, 'e, 'f)

  val p26 = (3, List('a, 'b, 'c, 'd, 'e, 'f))
  val a26 = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e))

  val p27 = true
  val a27 = false

  val p28 = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
  val a28 = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))

  val p29 = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
  val a29 = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))

  val p31 = 7
  val a31 = true

  val p32 = (36, 63)
  val a32 = 9

  val p33 = (35, 64)
  val a33 = true

  val p34 = 10
  val a34 = 4

}
