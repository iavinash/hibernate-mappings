package com.learn.hbm.model.entity.one2one;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "ID_CARD_TBL")
public class IdCard implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CARD_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cardId;

    @Column(name = "CARD_ISSUE_DT")
    private String issueDate;

    @Column(name = "VALID_TILL")
    private String validTillDate;

    /**
     * Inverse end.
     * Use of mappedBy attribute refers to the name of the attributes of the association on the order side,
     * which makes the Employee class the owner of the relationship and
     * responsible for updating the association column.
     */
    @OneToOne(mappedBy = "idCard")
    private Employee emp;

    public Long getCardId() {
        return cardId;
    }

    public IdCard setCardId(Long cardId) {
        this.cardId = cardId;
        return this;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public IdCard setIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public String getValidTillDate() {
        return validTillDate;
    }

    public IdCard setValidTillDate(String validTillDate) {
        this.validTillDate = validTillDate;
        return this;
    }

    public Employee getEmp() {
        return emp;
    }

    public IdCard setEmp(Employee emp) {
        this.emp = emp;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdCard idCard = (IdCard) o;
        return cardId.equals(idCard.cardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("cardId", cardId)
                .append("issueDate", issueDate)
                .append("validTillDate", validTillDate)
                .toString();
    }
}
