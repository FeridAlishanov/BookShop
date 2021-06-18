package Bookshop.BookShop.domain.Entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;
@Entity
public class BookImageMapping {
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private int BookId;
   private int  ImageId;

    private LocalDateTime CreationTime;
    private int   CreatorId;
    private LocalDateTime LastModificationTime;
    private int  LastModifiedId;
    private boolean IsDeleted ;
    private LocalDateTime  DeletionTime;
    private int DeleterId;
}
