object  MyFibS{
  def Fib(n:Int):Int={
    if(n>=0)
      {

        if(n==0)
          0
          else  if(n==1)
          1
        else
          Fib(n-2)+Fib(n-1);
      }else
      0;
  }

  def main(args: Array[String]): Unit = {
    println(Fib(5));
  }
}