// This is a long way of creating a run function. 

package dev.bucsa.run_tracker.run;

import java.time.LocalDateTime;

import javax.xml.stream.Location;

import ch.qos.logback.core.util.Duration;
import java.util.Objects;

public class Run_OldMethod {
    private Integer id;
    private String title; 
    private LocalDateTime startedOn; 
    private LocalDateTime completedOn; 
    private Integer miles; 
    private Location location;

    public Run_OldMethod(Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer miles, Location location){
        this.id = id;
        this. title = title;
        this.startedOn = startedOn;
        this.completedOn = completedOn;
        this.miles = miles;
        this.location = location;
        if (!completedOn.isAfter(startedOn)){
            throw new IllegalArgumentException("Completed On be after Start On");
        }
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setStartedOn(LocalDateTime startedOn) {
        this.startedOn = startedOn;
    }

    public LocalDateTime getCompletedOn() {
        return this.completedOn;
    }

    public void setCompletedOn(LocalDateTime completedOn) {
        this.completedOn = completedOn;
    }
    public void setMiles(Integer miles) {
        this.miles = miles;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public Duration getDuration(){
        return Duration.between(startedOn, completedOn);
    }

    public Integer getAveragePace(){
        return Math.toIntExact(getDuration().toMinutes() / miles);
    }

    public Integer getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public LocalDateTime getStartedOn(){
        return startedOn;
    }

    public Integer getMiles(){
        return miles;
    }
    public Location getLocation(){
        return location;
    }

    // Equal Code
    @Override
    public boolean  equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return  false;
        Run_OldMethod run = (Run_OldMethod) o;
        return Objects.equals(id, run.id) && Objects.equals(title, run.title) && Objects.equals0(startedOn, run.startedOn) && Objects.equals(completedOn, run.completedOn);
    }

    // Hashmap code
    public int hashCode(){
        return Objects.hash(id, title, startedOn, completedOn, miles, location);
    }

    // To String
    public String toString(){
        return "Run{" + 
            "id=" + id +
            ", title=" + title + '\''+
            ", startedOn=" + startedOn +
            ", completedOn=" + completedOn +
            ", miles=" + miles +
            ", location=" + location + '}';
    }

}
