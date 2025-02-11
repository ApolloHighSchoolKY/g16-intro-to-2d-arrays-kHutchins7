import java.util.Arrays;


public class IntroTo2DArrays{
  public static void main(String[] args){
      int [][]  ray= new int[2][3];


      ray [0][0]=1;
      ray [0][1]=2;
      ray [0][2]=3;
      ray [1][0]=4;
      ray [1][1]=5;
      ray [1][2]=6;
  /*
   1 2 3
   4 5 6
   */
  System.out.println(Arrays.toString(ray));
  //print the first array in the array ray
  System.out.println(Arrays.toString(ray[0]));
  System.out.println(Arrays.toString(ray[1]));
 //ray.length represents the number of rows
 //or how meny arrays is this a collection of
  for (int row=0; row<ray.length; row++)
  {
    System.out.println(Arrays.toString(ray[row]));
  }
  //change every voaalue in the array to 7
  //you must use loops

  //ray[#].length represent the numer of colums in each array in the array
  //or what size is the arrayin yhr array of arrays
  for(int row=0;row<ray.length;row++)
     for(int col =0;col<ray[row].length;col++)
     {
      ray[row][col]=7;

     }

     for (int row=0; row<ray.length; row++)
  {
    System.out.println(Arrays.toString(ray[row]));
  }

  //fill the array with numbers from 0 - 10 inclusive
  for(int row=0;row<ray.length;row++)
     for(int col =0;col<ray[row].length;col++)
     {
      ray[row][col]= (int)(Math.random()*11+0);

     }

     for (int row=0; row<ray.length; row++)
  {
    System.out.println(Arrays.toString(ray[row]));
  }
  //find the sum of each row
  //you must use loops
  int sum = 0;
  for(int row=0;row<ray.length;row++)
  {
    sum = 0;
    for(int col =0 ;col<ray[row].length; col++)
    {
      sum+=ray[row][col];

    }
    System.out.println("the sum of the row "+ row +" is "+ sum);
  }

  System.out.println("\n\n\nHomework Assignment");
  //add up the all the values of each row useing for each loops...
  
  int hwSum = 0;
  int hwSum2 =0;
  for(int x:ray[0])
  {
    hwSum += x;
    for(int y:ray[1])
    {
      hwSum2+=y;
    }
  }
  hwSum=(hwSum2/3)+hwSum;
    System.out.println("the sum of the array is " + hwSum);
  
  
  }
}
