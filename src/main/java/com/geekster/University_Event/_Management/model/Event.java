package com.geekster.University_Event._Management.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "event_tbl")
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eventId;

    @NotBlank
    private String eventName;

    @NotBlank
    private String locationOfEvent;

    @NotNull
    @JsonFormat(shape =  JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate date;

    @NotNull
    @JsonFormat(shape =  JsonFormat.Shape.STRING,pattern = "HH:mm:ss")

    private String startTime;

    @NotNull
    @JsonFormat(shape =  JsonFormat.Shape.STRING,pattern = "HH:mm:ss")
    private  String endTime;
}
