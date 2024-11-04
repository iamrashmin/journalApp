package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection = "journal_entries") //row
@Data
@NoArgsConstructor
public class JournalEntry {

    @Id //to use Id as key in database
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;

}