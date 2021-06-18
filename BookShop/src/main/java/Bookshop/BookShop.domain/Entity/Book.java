package Bookshop.BookShop.domain.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
          private int  Id;
          private  String  Name;
          private int  Code;
          private String Description;
          private  int Barcode;
          private int ISBN;
          private int  Status;
          private String ReleaseDate;
          private int  PageCount;


           private LocalDateTime CreationTime;
           private int   CreatorId;
           private LocalDateTime LastModificationTime;
           private int  LastModifiedId;
           private boolean IsDeleted ;
           private LocalDateTime  DeletionTime;
           private int DeleterId;
}
