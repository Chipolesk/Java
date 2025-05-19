package daniel.desafioBoardTarefas.dto;

import daniel.desafioBoardTarefas.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKindEnum kind,
                             int cardsAmount) {
    @Override
    public Long id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public BoardColumnKindEnum kind() {
        return kind;
    }

    @Override
    public int cardsAmount() {
        return cardsAmount;
    }
}
