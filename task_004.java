public class task_004 {
    public static void main(String[] args) {
        
             for (int i = 0; i < 9; i++) {
                 for (int j = 0; j < 9; j++) {
                     for (int k = 0; k < 9; k++) {
                         for (int l = 0; l < 9; l++) {
                             for (int m = 0; m < 9; m++) {
                                 for (int n = 0; n < 9; n++) {
                                     if ((i * 10 + j) + (k * 10 + l) == (m * 10 + n)) {
                                         int a = i * 10 + j;
                                         int b = k * 10 + l;
                                         int c = m * 10 + n;
                                         System.out.printf("%d + %d = %d   ", a, b, c);
                                         
                                    
                                     }
                                 }
                             }
                         }
                     }
                 }
             }
 
         }
     }
