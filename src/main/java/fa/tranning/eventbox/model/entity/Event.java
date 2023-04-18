package fa.tranning.eventbox.model.entity;

import fa.tranning.eventbox.model.enumm.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(length = 1000, nullable = false)
    private String description;
    @Column(name = "open_to_registration_date_time", nullable = false)
    private LocalDate openToRegistrationDateTime;
    @Column(name = "close_to_registration_date_time", nullable = false)
    private LocalDate closeToRegistrationDateTime;
    @Column(name = "start_date_time", nullable = false)
    private LocalDateTime startDateTime;
    @Column(name = "end_date_time", nullable = false)
    private LocalDateTime endDateTime;
    @Column(nullable = false)
    private String place;
    @Column(name = "is_public", nullable = false)
    private boolean isPublic;
    @Column(nullable = false)
    private Integer capacity;
    @Column(nullable = false)
    private Status status;
    @Column(nullable = false)
    private boolean deleted;
    @Column(name = "created_by", nullable = false)
    private String createdBy;
    @Column(name = "update_by", nullable = false)
    private String updatedBy;
    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate;
    @Column(name = "last_modified_date", nullable = false)
    private LocalDate lastModifiedDate;
}