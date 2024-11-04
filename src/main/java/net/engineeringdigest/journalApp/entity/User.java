package net.engineeringdigest.journalApp.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Document(collection = "users")
@Data
@Builder
public class User {

    @Id
    private ObjectId id;

    //Indexed enforces that username should be unique, but not automatically created.
    // Need to define property in application.properties - spring.data.mongodb.auto-index-creation
    @Indexed(unique = true)
    @NonNull //Lombok - null check during setter function - will throw NPE if null value
    private String userName;
    @NonNull //Lombok - null check during setteJournalEntryControllerr function - will throw NPE if null value
    private String password;

    @DBRef
    private List<JournalEntry> journalEntries = new ArrayList<>();
    private List<String> roles;

}
