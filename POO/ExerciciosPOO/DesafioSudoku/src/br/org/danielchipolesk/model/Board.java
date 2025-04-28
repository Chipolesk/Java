package br.org.danielchipolesk.model;

import java.util.Collection;
import java.util.List;


import static br.org.danielchipolesk.model.GameStatus.*;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Board {
    private final List<List<Space>> spaces;

    public Board(List<List<Space>> spaces) {
        this.spaces = spaces;
    }

    public List<List<Space>> getSpaces() {
        return spaces;
    }

    public GameStatus getStatus(){
        if (spaces.stream().flatMap(Collection::stream).noneMatch(
                space -> !space.isFixed() && nonNull(space.getActual()))){
            return NAO_INICIADO;
        }
        return spaces.stream().flatMap(Collection::stream).anyMatch(
                space -> isNull(space.getActual())) ? INCOMPLETO : COMPLETO;
    }
    public Boolean hasErrors(){
        if(getStatus() == NAO_INICIADO) {
            return false;
        }
      return  spaces.stream().flatMap(Collection::stream)
                .anyMatch(space -> nonNull(
                        space.getActual()) && !space.getActual().equals(space.getExpected()));
    }

    public Boolean changeValue(final int col, final int row, final Integer value){
        var space = spaces.get(col).get(row);
        if(space.isFixed()){
            return false;
        }
        space.setActual(value);
        return true;
    }
    public boolean clearValue(final int col, final int row){
        var space = spaces.get(col).get(row);
        if(space.isFixed()){
            return false;
        }
        space.clearSpace();
        return true;
    }
    public void reset(){
        spaces.forEach(c -> c.forEach(Space::clearSpace));
    }
    public boolean gameIsFinished(){
        return !hasErrors() && getStatus() == COMPLETO;
    }
}
