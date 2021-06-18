package Bookshop.BookShop.domain.Entity;

import javax.persistence.Entity;
import java.time.LocalDateTime;
@Entity
public class Category {
  private int  Id;
   private String  Name;
   private int  Code;


    private LocalDateTime CreationTime;
    private int   CreatorId;
    private LocalDateTime LastModificationTime;
    private int  LastModifiedId;
    private boolean IsDeleted ;
    private LocalDateTime  DeletionTime;
    private int DeleterId;
}
