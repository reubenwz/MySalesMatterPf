package entity;

import entity.OfferEntity;
import entity.UserEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-12T04:25:44")
@StaticMetamodel(SalesTransactionEntity.class)
public class SalesTransactionEntity_ { 

    public static volatile SingularAttribute<SalesTransactionEntity, OfferEntity> offer;
    public static volatile SingularAttribute<SalesTransactionEntity, BigDecimal> totalAmt;
    public static volatile SingularAttribute<SalesTransactionEntity, Long> salesTransactionId;
    public static volatile SingularAttribute<SalesTransactionEntity, Date> transactionDate;
    public static volatile SingularAttribute<SalesTransactionEntity, UserEntity> user;

}