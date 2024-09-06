package com.superfilmsaga.supermovies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;


@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    private ObjectId userID;
    private String fullName;
    private String userName;
    private String password;
    private String email;
    private String DoB;

}
