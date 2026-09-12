class CinemaShow {
    private String title;
    private int seatsAvailable;
    private final int capacity;
    private static int totalBooked = 0;

    CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    CinemaShow(String title) {
        this(title, 100);
    }

    boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable -= n;
            totalBooked += n;
            return true;
        } else {
            return false;
        }
    }

    void cancel(int n) {
        seatsAvailable += n;
        totalBooked -=n;
        if (seatsAvailable > capacity)
            seatsAvailable = capacity;
    }

    int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static int getTotalBooked() {
        return totalBooked;
    }
    
    String getTitle() {
        return title;
    }
    public static void main(String[] args) {
        CinemaShow show1 = new CinemaShow("Avengers", 200);
        CinemaShow show2 = new CinemaShow("Avatar");

        System.out.println(show1.getTitle());
        System.out.println(show1.getSeatsAvailable());

        System.out.println(show1.book(50));
        System.out.println(show1.getSeatsAvailable());

        System.out.println(show1.book(200));
        System.out.println(show1.getSeatsAvailable());

        show1.cancel(20);
        System.out.println(show1.getSeatsAvailable());

        System.out.println("Total booked: " + CinemaShow.getTotalBooked());
    }
}