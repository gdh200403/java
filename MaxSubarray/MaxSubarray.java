package MaxSubarray;

public class MaxSubarray {
    public static void main(String[] args){
        if(args.length!=1){
            System.out.println("wrong format!!");
            return;
        }
        String[] para = args[0].split(":");
        int arr_num = Integer.parseInt(para[0]);
        if(para.length!=2){
            System.out.println("wrong format!!");
            return;
        }
        String[] data_s = para[1].split(",");
        if(data_s.length!=arr_num){
            System.out.println("wrong format!!");
            return;
        }
        int[] data = new int[arr_num];
        for(int i=0;i<arr_num;i++){
            data[i]=Integer.parseInt(data_s[i]);
        }
        //split the args and initialize data
        int maxSum = data[0];
        int curSum = data[0];
        for(int i=1;i<arr_num;i++){
            if(curSum<0){
                curSum=data[i];
            }
            else{
                curSum+=data[i];
            }
            maxSum=Math.max(maxSum, curSum);
        }
        //calculate the maxSum
        System.out.println(maxSum);
        return;
    }
}
