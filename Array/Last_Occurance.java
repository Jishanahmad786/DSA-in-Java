public class Last_Occurance {

    public static void Solve(int arr[],int x)
    {
        int lastIndex=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                lastIndex=i;
            }
           

        }
        System.out.println(lastIndex);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,5,4,7,8,9,8};
        int x=8;
        Solve(arr,x);
    }
    
}
