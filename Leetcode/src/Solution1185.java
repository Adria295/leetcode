import org.junit.Test;

public class Solution1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        //1970.12.31 4
        Boolean ifLeap = ifLeapYear(year);
        int yearDays = yearDays(year);
        int monthDays = monthDays(month,ifLeap);
        int totalDays = yearDays + monthDays + day;
        int dayNumOfTheWeek = (totalDays +4) % 7;
        String[] dayList = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return dayList[dayNumOfTheWeek];
    }

    public Boolean ifLeapYear(int year){
        return (year%4==0&&year%100!=0)||(year%400==0);
    }

    public int yearDays(int year){
        int days = 0;
        for (int i=1971;i<year;i++){
            if (ifLeapYear(i)){
                days +=366;
            }else {days+=365;}
        }
        return days;
    }

    public int monthDays(int month,Boolean ifLeap){
        int days = 0;
        int[] daysList = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i=1;i<month;i++){
            days += daysList[i-1];
        }
        return (ifLeap&&month>2) ? (days+1) : days;
    }

    @Test
    public void Test(){
        System.out.println(dayOfTheWeek(31,1,2016));
        System.out.println(dayOfTheWeek(1,2,2016));
        System.out.println(dayOfTheWeek(3,1,2022));
    }
}
