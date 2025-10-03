public class main {
    public static void main (String[] args) {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        for (int i = 10; i < 15; i++) schedule[1][i] = true;
        a.printPeriod(2);
        a.findFreeBlock(2, 15);
        int period = 2;
        while (period < 5) {
            System.out.println("Period: " + period);
            a.printPeriod(period);
            period++;
        }
        a.printPeriod(4);
        System.out.println(a.makeAppointment(2, 4, 22));
        a.printPeriod(4);
        System.out.println(a.makeAppointment(2, 4, 22));
        System.out.println(a.makeAppointment(3, 4, 3));
        System.out.println(a.makeAppointment(2, 4, 30));
    }
}
