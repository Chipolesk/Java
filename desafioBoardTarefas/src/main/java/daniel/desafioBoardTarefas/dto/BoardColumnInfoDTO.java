package daniel.desafioBoardTarefas.dto;

import daniel.desafioBoardTarefas.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
