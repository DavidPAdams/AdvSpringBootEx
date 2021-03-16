package com.dav.subscriberListHW.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dav.subscriberListHW.model.Subscriber;
import com.dav.subscriberListHW.repository.SubscriberRepository;

@Controller
public class SubscriberController {
  
  @Autowired
  private SubscriberRepository subscriberRepository;

  @GetMapping(value = "/")
  public String index(Subscriber subscriber) {
    return "subscriber/index";
  }
  
  @GetMapping(value = "/subscribers")
  public String getAllSubscribers(Subscriber subscriber, Model model) {
    List<Subscriber> subscribers = new ArrayList<Subscriber>();
    subscribers = subscriberRepository.findAll();
    model.addAttribute("subscribers", subscribers);
    return "subscriber/subscribers";
  }
  
  @PostMapping(value = "/")
  public String addNewSubscriber(Subscriber subscriber, Model model) {
    Subscriber subscriberToAdd = new Subscriber(subscriber.getFirstName(), 
        subscriber.getLastName(),
        subscriber.getUsername());
    subscriberRepository.save(subscriberToAdd);
    model.addAttribute("firstName", subscriberToAdd.getFirstName());
    model.addAttribute("lastName", subscriberToAdd.getLastName());
    model.addAttribute("username", subscriberToAdd.getUsername());
    return "subscriber/result";
  }
  
}
