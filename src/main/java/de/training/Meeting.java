package de.training;

import javax.persistence.*;
import java.time.LocalTime;

@Entity //Kennzeichnet eine Klasse als Datenbanktabelle.
@Table(name = "Meeting") //Tabellenname

public class Meeting {

    @Id //Markiert den Primärschlüssel.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Legt fest, wie der Schlüssel erzeugt wird
    @Column(name = "meeting_id") //Ordnet ein Feld einer bestimmten Spalte zu.
    private Integer id;

    @Column(name = "visitor", length = 100)
    private String visitor;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "location", length = 100)
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
