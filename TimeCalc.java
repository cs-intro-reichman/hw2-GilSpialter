public class TimeCalc {
//Adds certain num of minutes to the time. Prints the new time in 24 hr format.
    public static void main(String[] args) {
    int HH = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
    int MM = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

    int inputM = Integer.parseInt(args[1]);
    int addHr = inputM / 60;
    int addMin = inputM % 60;

    HH += addHr;
    MM += addMin;
    if (MM >= 60) {             //correcting hours and minutes to fit there clock:  Hours < 24,  Minutes < 60
        MM -= 60;
        HH ++;
    }
    if (HH >= 24) {
        HH %= 24;
    }
                                        //Now outputting final answer.
    if (HH < 10) {
        System.out.print("0");
    }
    System.out.print(HH+":");   
    if (MM < 10) {
        System.out.print("0");
    }
    System.out.println(MM);
    }
}
