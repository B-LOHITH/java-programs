class Linear{
            public static int  linearsearch(int arr[],int key){
              int i;
               for(i=0;i<arr.length;i++){
                   if(arr[i]==key)
                      return i+1;
                  }
                   return 0;
                   }
public static void main(String args[]){
int arr[]={1,2,3,4,5};
int key=3;
int n =linearsearch(arr,key);
if(n>0)
      System.out.println(" number is found ");
else
      System.out.println(" number is not found");
      
  }   
  }                          
