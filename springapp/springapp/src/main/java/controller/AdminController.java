package controller;
import org.springframework.web.bind.annotation.*;
import dao.IMovie;
import model.Movie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import dao.IBooking;
import model.Booking;

@RestController
public class AdminController {
    
    @Autowired
    IMovie movie;

    @Autowired
    IBooking booking;
    
    @GetMapping("/admin")
    public List<Movie> adminViewMovieList(){
        return movie.findAll();
    }

    @PostMapping("/admin/movie")
    public String addMovie(@RequestBody Movie m){
        movie.save(m);
        return "Movie added";
    }

    @DeleteMapping("/admin/movie/{id}")
    public String deleteMovie(@PathVariable("id") int mid){
        if(movie.findById(mid).isPresent()){
            movie.deleteById(mid);
            return "Movie deleted";
        }
        return "Movie with ID: "+mid+" is not there.";
    }

    @PutMapping("/admin/movie/{id}")//change to movie and check
    public String updateMovie(@RequestBody Movie m, @PathVariable("id") int mid){
        if(movie.findById(mid).isPresent()){
            movie.findById(mid).map(movie1->{
                movie1.setMname(m.getMname());
                return movie.save(movie1);
            });
            return "Update Movie details of Particular id";
        }
        return "Movie with ID: "+mid+" is not there.";
    }

    @GetMapping("/admin/allBooking")
 public List<Booking>  allBooking(){
     return booking.findAll();
 }
}
