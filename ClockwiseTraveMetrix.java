public class ClockwiseTraveMetrix {
  
  public static void main(String[] args) {
      
      StringBuffer sb = new StringBuffer();       
      System.out.println("Test 4X4 metrix output reuslts:");
      int m[][]={{1,2,3,4},
               {5,6,7,8},
               {9,10,11,12},
               {13,14,15,16}};    
      traveler(sb, m, 0, 4);     
      
      System.out.println("The 5X5 metrix output reuslts:");
      sb = new StringBuffer();
      int x[][]={{1,2,3,4,5},
                 {6,7,8,9,10},
                 {11,12,13,14,15},
                 {16,17,18,19,20},
                 {21,22,23,24,25}};     
      traveler(sb, x, 0, 5);      
      
    System.out.println("The 10X10 metrix output reuslts:");
    sb = new StringBuffer();
    int b[][]={{1,2,3,4,5,6,7,8,9,10},
               {11,12,13,14,15,16,17,18,19,20},
               {21,22,23,24,25,26,27,28,29,30},
               {31,32,33,34,35,36,37,38,39,40},
               {41,42,43,44,45,46,47,48,49,50},
               {51,52,53,54,55,56,57,58,59,60},
               {61,62,63,64,65,66,67,68,69,70},
               {71,72,73,74,75,76,77,78,79,80},
               {81,82,83,84,85,86,87,88,89,90},
               {91,92,93,94,95,96,97,98,99,100}};    
    traveler(sb, b, 0, 10);

  }
    static void traveler(StringBuffer sb, int metrix[][],int p,int d){   
                
       
        if (p >= d) {
            sb.delete(sb.length()-2,sb.length());
            System.out.println(sb.toString());
            return;
        }
   
        for(int i = p; i < d; i++){
            sb.append(metrix[p][i]+", ");
        }
   
        for(int i = p+1; i < d; i++){
             sb.append(metrix[i][d-1]+", ");
        }
   
        for(int i = d-2; i >= p; i--){
             sb.append(metrix[d-1][i]+", ");
        }
   
        for(int i = d-2; i > p; i--){
             sb.append(metrix[i][p]+", ");
        }
   
        traveler(sb, metrix, p+1, d-1);
    }
}
