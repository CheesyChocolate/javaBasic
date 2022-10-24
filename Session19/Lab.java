package Session19;

class Point {
    double x;
    double y;
}
class Circle {
    Point origin;
    double radius;
}
class PointP {
    double r;
    double theta;
}
class Date {
    int day;
    int month;
    int year;
}
class Person {
    String name;
    Date bday;
    Integer age;
}

public class Lab {

    static PointP newPointP(double r, double theta) {
        PointP p = new PointP();
        p.r = r;
        p.theta = theta;
        return p;
    }
    static Date newDate(int day, int month, int year) {
        Date d = new Date();
        d.day = day;
        d.month = month;
        d.year = year;
        return d;
    }
    static Person newPerson(String name, Date bday) {
        Person p = new Person();
        p.name = name;
        p.bday = bday;
        p.age = null;
        return p;
    }

    /* main method */
    public static void main(String[] args) {
        //empty
    }

    /* Write a function which takes two circles and returns 
    true iff they intersect with each other. */
    static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    static boolean intersects(Circle c1, Circle c2) {
        return distance(c1.origin, c2.origin) <= c1.radius + c2.radius;
    }

    /* Write a function which reflects a point about another 
    point (call it mirror), taking both as parameters. */
    static void reflect(Point p, Point mirror) {
        p.x += 2 * (mirror.x - p.x);
        p.y += 2 * (mirror.y - p.y);
    }

    /* Write a function which takes a point represented in 
    cartesian coordinates and returns an equivalent point 
    represented in polar coordinates. You can assume 
    that the input point always lies in first or fourth 
    quadrant of the cartesian plane. */
    static PointP toPolar(Point p) {
        double r = Math.sqrt(p.x*p.x + p.y*p.y);
        double theta = Math.atan(p.y / p.x);
        return newPointP(r, theta);
    }

    /* Write a function which takes two dates and returns 
    their difference as another date object. For simplicity 
    assume that a month is always 30 days and the first 
    parameter of the function is always the earlier date. */
    static Date dateDiff(Date d1, Date d2) {
        // d1 is always back in time
        if(d1.day > d2.day) {
            d2.day += 30;
            d2.month--;
        }
        if(d1.month > d2.month) {
            d2.month += 12;
            d2.year--;
        }
        return newDate(d2.day - d1.day, d2.month - d1.month, d2.year - d1.year);
    }

    /* Write a function which recalculates people’s age 
    based on today’s date and birthdays of people. You 
    can use the function you wrote in the previous 
    question. Round ages to the closest integral values. */
    static int roundDate(Date d) {
        // the middle is exactly in between
        // 30th June and 1st July
        if(d.month <= 6)
            return d.year;
        else
            return d.year + 1;
    }
    static void updateAges(Person[] people, Date today) {
        for(Person p: people)
            p.age = roundDate( dateDiff(p.bday, today) );
    }

}