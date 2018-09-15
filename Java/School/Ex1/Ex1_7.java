public class Ex1_7 {
    public static void main(String[] args) {
        double result1=0,result2=0 ;
        int t=1;
        for(double i=1.0;i<=13;i=i+2,t++){
            if(i<=11&&t%2==0){
                result1 = result1-1/i;
            }
            if(i<=11&&t%2==1){
                result1 = result1+1/i;
            }
            if(t%2==1){
                result2 = result2+1/i;
            }
            if(t%2==0){
                result2 = result2-1/i;
            }
        }

        System.out.println(4*result1);
        System.out.println(4*result2);
    }
}