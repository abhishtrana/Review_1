import java.util.*;
class Twod{
public static void main(String [] args){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the size of Matrix");
int n=sc.nextInt();
int [][] arr= new int[n][n];
int [][] arr2= new int[n][n];
System.out.println("Enter input for First Array-:");
for(int i =0;i<n;i++){
for(int j=0;j<n;j++){
arr[i][j]=sc.nextInt();
}
}
System.out.println("Enter input for Second Array-:");
for(int i =0;i<n;i++){
for(int j=0;j<n;j++){
arr2[i][j]=sc.nextInt();
}
}
for(int i =0;i<n;i++){  
for(int j=0;j<n;j++){   
arr2[i][j]+=arr[i][j];}
}
for(int i =0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(arr2[i][j]+"  ");
}
System.out.println();
}
int c=0;
for(int i =0;i<n;i++){
for(int j=0;j<n;j++){
c+=arr2[i][j];}
}
System.out.println("The sum of all the elemets of Matrix is-: "+c);
}
}
