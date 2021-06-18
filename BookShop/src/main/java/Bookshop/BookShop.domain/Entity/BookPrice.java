package Bookshop.BookShop.domain.Entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
public class BookPrice {
   private int Id;
   private int BookId;
   private BigDecimal Price;
   private int  Status;

    private LocalDateTime CreationTime;
    private int   CreatorId;
    private LocalDateTime LastModificationTime;
    private int  LastModifiedId;
    private boolean IsDeleted ;
    private LocalDateTime  DeletionTime;
    private int DeleterId;
}
