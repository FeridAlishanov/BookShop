package Bookshop.BookShop.domain.Entity;

import javax.persistence.Entity;
import java.time.LocalDateTime;
@Entity
public class BookAutherMapping {
   private int  Id;
  private int   BookId;
    private int AuthorId;
    private LocalDateTime CreationTime;
    private int   CreatorId;
    private LocalDateTime LastModificationTime;
    private int  LastModifiedId;
    private boolean IsDeleted ;
    private LocalDateTime  DeletionTime;
    private int DeleterId;
}
