package com.example.mytwitter.repos;

import com.example.mytwitter.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
