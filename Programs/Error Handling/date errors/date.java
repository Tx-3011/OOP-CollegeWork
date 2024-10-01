import java.util.*;

class monthError extends Exception{
    monthError(int month){
        System.out.println("invalid month : " + month );
    }
}

class dayError extends Exception{
    dayError(int day){
        System.out.println("invalid day : " + day );
    }
}



class currentDate{
    int day;
    int month;
    int year;


    void checkDate()throws monthError,dayError{

    if(month>12){
        throw new monthError(month);
    }

    if(month%2==0 && month!=8 && month!=10 && month !=12 && month!=2){
        if(day>30){
            throw new dayError(day);
        }
        
    }else if(month==2){
        if(day>28){
            throw new dayError(day);
        }
    }else if(day>31){
        throw new dayError(day);
    }else{
        System.out.println(day + "." + month + "." + year);
    }

}


}

class date{
    public static void main(String [] args) throws monthError,dayError{

        currentDate d1 = new currentDate();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter day, month, year : ");
        d1.day = in.nextInt();
        d1.month = in.nextInt();
        d1.year = in.nextInt();

        d1.checkDate();

        in.close();
    }
}

