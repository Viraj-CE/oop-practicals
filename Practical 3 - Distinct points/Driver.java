class Driver {
    public static void main(String[] args) {
        Point[] point = new Point[5];
        point[0] = new Point(1, 2);
        point[1] = new Point(2, 3);
        point[2] = new Point(3, 4);
        point[3] = new Point(2, 3);
        point[4] = new Point(3, 4);

        int distinct = 0;
        for (int i = 0; i < point.length; i++) {
            boolean alreadyExist = false;
            for (int j = 0; j < i; j++) {
                if (point[i].equals(point[j])) {
                    alreadyExist = true;
                }
            }
            if (!alreadyExist) {
                distinct++;
            }
        }
        System.out.println("Distinct :" + distinct);

    }
}
