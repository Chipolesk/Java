package daniel.desafioProjeto.domain.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import org.hibernate.annotations.Collate;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID único da conta", example = "10")
    private Long id;

    @Column(unique = true)
    @Schema(description = "Número da conta", example = "12345-6")
    private String number;

    @Schema(description = "Agência da conta", example = "001")
    private String agency;
    //saldo
    @Column(precision = 13, scale = 2)
    @Schema(description = "Saldo da conta", example = "1500.50")
    private BigDecimal balance;

    @Column(name ="additional_limit", precision = 13, scale = 2)
    @Schema(description = "Limite de cheque especial da conta", example = "1500.50")
    private BigDecimal limit;


    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}

    public String getAgency() {return agency;}

    public void setAgency(String agency) {this.agency = agency;}

    public BigDecimal getBalance() {return balance;}

    public void setBalance(BigDecimal balance) {this.balance = balance;}

    public BigDecimal getLimit() {return limit;}

    public void setLimit(BigDecimal limit) {this.limit = limit;}
}
