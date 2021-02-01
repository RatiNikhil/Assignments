//The Goal is
//to print the given pattern as follows based on the number of lines as input.
public class Pattern2 {

	  public static void main (String args[]){
	int i=1,j=1,k=1,n1=6,n2=6,count=0;
	while(k<n1-(n1-i)){
		System.out.print(" ");
		k++;
		}
	while(i<=n1){
	k=1;
	
	count=n2-i;
	j=1;
	while(j<=count){
	  
	  System.out.print(n1-(n1-j));
	  j++;
	}
	i++;
	System.out.println(" ");
	}
	  }
	}