package com.tts.subscriberListHW.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.subscriberListHW.model.Subscriber;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {
  List<Subscriber> findAll();
}
