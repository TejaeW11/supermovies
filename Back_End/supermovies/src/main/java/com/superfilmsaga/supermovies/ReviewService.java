package com.superfilmsaga.supermovies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    private ReviewRepo reviewRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String title){
        Review review = reviewRepo.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class).matching(Criteria.where("title")
                .is(title)).apply(new Update().push("reviewIds").value(review)).first();
        return review;
    }
}
