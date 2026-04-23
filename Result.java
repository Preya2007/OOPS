interface Classify {
    String getDivision(double average);
}

class Result implements Classify {

    // Implementing the method from interface
    public String getDivision(double average) {

        if (average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }

    public static void main(String[] args) {

        Result r1 = new Result();

        double avg = 65.5;

        String division = r1.getDivision(avg);

        System.out.println("Average Marks: " + avg);
        System.out.println("Division: " + division);
    }
}