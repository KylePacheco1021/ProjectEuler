//Find the sum of all the multiples of 3 or 5 below 1000.

var summand = 0

for(x <- 1 until 1000) {
  if((x%3==0)||(x%5==0))
    summand+=x
}

println(summand)