// A Java program to demonstrate use of Comparable
import java.util.*;

// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
    private int rating;
    private String name;
    private int year;

    // Used to sort movies by year
    /*public int compareTo(Movie m)
    {
        return this.year - m.year;
    }*/
    public int compareTo(Movie m)
    {
        return this.rating - m.rating;
    }

    // Constructor
    public Movie(String name, int rating, int year)
    {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName() { return name; }
    public int getYear()	 { return year; }
}

// Driver class
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8, 2015));
        list.add(new Movie("Star Wars", 2, 1977));
        list.add(new Movie("Empire Strikes Back", 7, 1980));
        list.add(new Movie("Return of the Jedi", 4, 1983));

        System.out.println("Movies before sorting : " + list);

        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
