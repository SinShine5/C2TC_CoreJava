package Class1;
public class First {
	 public static void main(String[] args) {
	        int i,j,n=6;
	        for(i=1;i<n;i++){
	            for(j=1;j<n;j++){
	                if(i==0 || j==0 ||i==n-1 || j==n-1){
	                   System.out.print("*"); 
	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
	        System.out.print("\n");
	        }
	    }
	 }