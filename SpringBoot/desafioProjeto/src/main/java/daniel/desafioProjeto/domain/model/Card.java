package daniel.desafioProjeto.domain.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID do cartao", example = "1")
    private Long id;

    @Column(unique = true)
    @Schema(description = "numero do cartao", example = "XXXX XXXX XXXX XXXX")
    private String number;

    @Column(name ="available_limit",precision = 13, scale = 2)
    @Schema(description = "Limite do cartap", example = "1500.50")
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
