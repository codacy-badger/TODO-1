package inf112.core.programcards;

import java.util.List;

public abstract class ProgramCards {
    private int priority;
    private String name;
    private List<movement> sequence;

    public enum movement{
        FORWARD_ONCE,
        TURN_RIGHT,
        TURN_LEFT,
        BACKWARD_ONCE
    }

    public ProgramCards(int priority, String name, List<movement> sequence){
        this.priority = priority;
        this.name = name;
        this.sequence = sequence;
    }

    public int getPriority(){
        return priority;
    }

    public String getName(){
        return name;
    }

    public List<movement> getSequence(){
        return sequence;
    }
}
