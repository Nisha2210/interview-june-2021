package exam;

public class ShiftElementsInArray {

  public static void main(String[] args) {
     int [] arr= new int[]{1,2,3,4,5};
    int n=3;
    System.out.println("Array without shifting");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+"");
  }
    for(int i=0;i<n;i++)
      int j,end;
      end=arr[arr.length-1];
    for(j=arr.length-1;j>0;j--){
      arr[j]=arr[j-1];
    }
    arr[0]=end;
   }
  System.out.println();
  System.out.println("After Shifting ");
  for(int i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]+"");
  }
}
}
