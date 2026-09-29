
package eventmanagementsystem;

public class EventBooking 
{
    String id;
    String catagory;
    String eventName;
    String eventDate;
    String location;
    String duration;

    public EventBooking(String id, String catagory, String eventName, String eventDate, String duration, String location) 
    {
        this.id = id;
        this.catagory = catagory;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.location = location;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
      
}
