package com.tts.subscriberListHW.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tts.subscriberListHW.model.Subscriber;

@Controller
public class SubscriberController {

    @GetMapping(value = "/")
    public String index(Subscriber subscriber) {
      return "subscriber/index";
    }
}
