package com.doodle.poll.repository;

import com.doodle.poll.model.Poll;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PollsRepository extends MongoRepository<Poll, String> {
}
