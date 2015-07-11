def fib(n) {
  n<2 ? 1 : fib(n-1)+fib(n-2)
}
if (args){
 println fib(args[0] as Integer)
}
