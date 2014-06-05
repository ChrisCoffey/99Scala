import org.specs2.mutable.Specification


class Tests extends Specification
  with TestData{

  "99 Scala Problems " should {

    "problem 1 " in {
      Problems.last(p1) must beEqualTo(a1)
    }

    "problem 2 " in {
      Problems.penultimate(p2) must beEqualTo(a2)
    }

    "problem 3 " in {
      Problems.nth(p3, 2) must beEqualTo(a3)
    }

    "problem 4 " in {
      Problems.count(p4) must beEqualTo(a4)
    }

    "problem 5 " in {
      Problems.reverse(p5) must beEqualTo(a5)
    }

    "problem 6 " in {
      Problems.isPalindrome(p6) must beEqualTo(a6)
    }

    "problem 7 " in {
      Problems.flatten(p7) must beEqualTo(a7)
    }

    "problem 8 " in {
      Problems.compress(p8) must beEqualTo(a8)
    }

    "problem 9 " in {
      Problems.pack(p9) must beEqualTo(a9)
    }

    "problem 10 " in {
      Problems.runLengthEncodePack(p10) must beEqualTo(a10)
    }

    "problem 11 " in {
      Problems.runLengthEncodeMod(p11) must beEqualTo(a11)
    }

    "problem 12 " in {
      Problems.decodeEncoded(p12) must beEqualTo(a12)
    }

    "problem 13 " in {
      Problems.runLengthEncode(p13) must beEqualTo(a13)
    }

    "problem 14 " in {
      Problems.doubleElements(p14) must beEqualTo(a14)
    }

    "problem 15 " in {
      Problems.duplicate(p15._1, p15._2) must beEqualTo(a15)
    }

  }

}
