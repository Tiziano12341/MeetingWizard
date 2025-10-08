package de.training;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "meeting_employee_rating")
public class MeetingEmployeeRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meeting_employee_rating_id")
    private Integer id;

    //Fremdschlüssel - Viele Ratings können zu einem Meeting gehören
    @ManyToOne
    @JoinColumn(name = "meeting_id", nullable = false)
    private Meeting meeting;

    //Fremdschlüssel - Viele Ratings können zu einem Employee gehören
    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "environment", length = 100)
    private String environment;

    @Column(name = "target_reached", length = 100)
    private String targetReached;

    @Column(name = "preparation", length = 100)
    private String preparation;

    @Column(name = "content", length = 100)
    private String content;

    @Column(name = "rating_time")
    private LocalTime ratingTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getTargetReached() {
        return targetReached;
    }

    public void setTargetReached(String targetReached) {
        this.targetReached = targetReached;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalTime getRatingTime() {
        return ratingTime;
    }

    public void setRatingTime(LocalTime ratingTime) {
        this.ratingTime = ratingTime;
    }
}
