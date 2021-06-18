package Bookshop.BookShop.domain.Entity;

import javax.persistence.Entity;
import java.time.LocalDateTime;
@Entity
public class Image {
   private int  Id;
   private String  Path;

    private LocalDateTime CreationTime;
    private int   CreatorId;
    private LocalDateTime LastModificationTime;
    private int  LastModifiedId;
    private boolean IsDeleted ;
    private LocalDateTime  DeletionTime;
    private int DeleterId;
}
