package com.superfilmsaga.supermovies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepo extends MongoRepository<Movie, ObjectId> {

    Optional<Movie> findMovieByTitle(String title);
}
