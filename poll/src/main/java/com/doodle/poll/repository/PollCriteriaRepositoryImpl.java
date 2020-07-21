package com.doodle.poll.repository;

import java.util.List;

import com.doodle.poll.model.Poll;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class PollCriteriaRepositoryImpl implements PollCriteriaRepository {

	private MongoTemplate mongoTemplate;

	public PollCriteriaRepositoryImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public List<Poll> searchPolls(String initiatorName, String title, Long afterDateTimestamp) {
		Query query = new Query();

		if (initiatorName != null) {
			query.addCriteria(Criteria.where("initiator.name").regex(initiatorName));
		}

		if (title != null) {
			query.addCriteria(Criteria.where("title").regex(title));
		}

		if (afterDateTimestamp != null) {
			query.addCriteria(Criteria.where("initiated").gt(afterDateTimestamp));
		}

		return mongoTemplate.find(query, Poll.class);
	}

}
