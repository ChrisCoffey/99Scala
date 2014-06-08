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

    "problem 16 " in {
      Problems.dropNth(p16._1, p16._2) must beEqualTo(a16)
    }

    "problem 17 " in {
      Problems.splitAt(p17._1, p17._2) must beEqualTo(a17)
    }

    "problem 18 " in {
      Problems.takeSlice(p18._1, p18._2, p18._3) must beEqualTo(a18)
    }

    "problem 19 " in {
      Problems.rotateLeft(p19a._1, p19a._2) must beEqualTo(a19a)
      Problems.rotateLeft(p19b._1, p19b._2) must beEqualTo(a19b)
    }

    "problem 20 " in {
      Problems.removeNth(p20._1, p20._2) must beEqualTo(a20)
    }

    "problem 21 " in {
      Problems.insertAt(p21._1, p21._2, p21._3) must beEqualTo(a21)
    }

    "problem 22 " in {
      Problems.range(p22._1, p22._2) must beEqualTo(a22)
    }

    "problem 31 " in {
      Problems.isPrime(p31) must beEqualTo(a31)
    }

    "problem 32 " in {
      Problems.gcd(p32._1, p32._2) must beEqualTo(a32)
      Problems.euclidGCD(p32._1, p32._2) must beEqualTo(a32)
    }

    "problem 33 " in {
      Problems.coPrime(p33._1, p33._2) must beEqualTo(a33)
    }

    "problem 34 " in {
      Problems.totient(p34) must beEqualTo(a34)
    }

    "problem 35 " in {
      Problems.primeFactors(p35) must beEqualTo(a35)
    }

    "problem 36 " in {
      Problems.primeFactorGroups(p36) must beEqualTo(a36)
    }

    "problem 37 " in {
      Problems.fastTotient(p37) must beEqualTo(a37)
    }

  }

}
