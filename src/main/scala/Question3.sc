import scala.collection.mutable.ListBuffer
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

def divisors(n: Long): List[Long] = {
  var factors = new ListBuffer[Long]

  var x: Long = 1L
  while(x<=n/2){
    if(n%x==0)
      factors+=x
    x+=1L
  }

  factors.toList
}

def isItPrime(p: Long): Boolean = {
  if((divisors(p).length==1)&&(p!=1))
    true
  else
    false
}

def primeDivisors(n: Long): List[Long] = {
  val factors = divisors(n)
  var primes = new ListBuffer[Long]

  for(x<-factors) {
    if(isItPrime(x))
      primes+=x
  }

  primes.toList
}

val numberToCheck: Long = 600851475143L

println(primeDivisors(numberToCheck).max)