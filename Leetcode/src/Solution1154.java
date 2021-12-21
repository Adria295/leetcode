public class Solution1154 {
    public int dayOfYear(String date) {
        int[] dayOfMonth;
        int [] dayOfLP = {31,29,31,30,31,30,31,31,30,31,30,31};
        int [] dayOfCP = {31,28,31,30,31,30,31,31,30,31,30,31};
        int month;
        int day;
        int ans = 0;
        if ("0".equals(Integer.parseInt(date.substring(5,6)))){
            month = Integer.parseInt(date.substring(6,7));
        }else{
            month = Integer.parseInt(date.substring(5,7));
        }
        if ("0".equals(Integer.parseInt(date.substring(8,9)))) {
            day = Integer.parseInt(date.substring(8, 9));
        }
        else {
            day = Integer.parseInt(date.substring(8, 10));
        }
        if(ifLeapYear(date))
            {dayOfMonth=dayOfLP;}
        else{
            dayOfMonth=dayOfCP;
        }
        for (int i=0;i<month-1;i++){
            ans+=dayOfMonth[i];
        }
        return ans+=day;
    }

    public boolean ifLeapYear(String date){
        int year = Integer.parseInt(date.substring(0,4));
        return (year%4==0 && year%100!=0) || year%400==0;
    }

    public static void main(String[] args) {
        String date = "2003-03-01";
        //System.out.println(date.substring(8));
        //boolean b = ifLeapYear("2000-03-01");
        //System.out.println(dayOfYear("2000-03-01"));
    }
}
