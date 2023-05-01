package com.geekster.University_Event._Management.controller;

import com.geekster.University_Event._Management.model.Event;
import com.geekster.University_Event._Management.service.EventService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value = "events")
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping(value = "events")
    public String addEvents(@RequestBody List<Event> eventList){
        return eventService.addEvents(eventList);
    }

    @GetMapping(value = "events")
    public List<Event> getEventsBasedOnDate(@Nullable @RequestParam String date){

        return eventService.getEventsBasedOnDate(date);
    }

    @DeleteMapping(value = "events/{id}")
    public String deleteEvent(@PathVariable Integer id){
        return eventService.deleteEvent(id);
    }

    @PutMapping(value = "events/{id}")
    public String updateEvent(@PathVariable Integer id , @RequestBody Event event){
        return eventService.updateEvent(id , event);
    }



}
