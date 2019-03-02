import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {
    // Instance variables:
    private String title;                     // title of the movie
    private ArrayList<Integer> ratings = new ArrayList<>();       // list of ratings stored in a Store object

    // Constructors:
    public Mreview() {
        title = "";
    }

    public Mreview(String ttl) {
        title = ttl;
    }

    public Mreview(String ttl, int firstRating) {
        title = ttl;
        ratings.add(firstRating);
    }

    // Member function:
    public String getTitle() {
        return title;
    }

    public void addRating(int r) {
        ratings.add(r);
    }

    public double aveRating() {
        int sum = 0;
        for (int i : ratings) {
            sum += i;
        }
        return sum/(double)(ratings.size());
    }

    public int numRatings() {
        return ratings.size();
    }

    public int compareTo(Mreview obj) {
        return this.title.compareTo(obj.title);
    }

    public boolean equals(Object obj) {
        Mreview castingHelper = (Mreview)obj;
        if (this.title.equals(castingHelper.title)) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return this.getTitle() + ", average " + this.aveRating() + " out of " + this.numRatings() + " ratings";
    }

    public static void main(String[] args) {
        Mreview mreview = new Mreview("THE WANDERING EARTH", 10);
        mreview.addRating(6);
        mreview.addRating(7);
        mreview.addRating(9);
        System.out.println(mreview);
        System.out.println(mreview.aveRating());

    }
}
