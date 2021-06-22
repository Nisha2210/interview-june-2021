package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    int bi[]=new int[40];
    int index=0;
    while(n>0){
      bi[index++]=n%2;
      n=n/2;
    }
    for(int i=index-1;i>=0;i--){
      System.out.print(bi[i]);
    }
    System.out.println();
  }
  public static void main(String args[]){
    System.out.println("demical of 10");
    toBinary(10);
  }
}
