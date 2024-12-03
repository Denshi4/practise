package org.college.practise2.task3.p2;

import java.util.ArrayList;

public class DishController {
    private ArrayList<AbstractCommand> _commandToExecute = new ArrayList<>();
    private ArrayList<AbstractCommand> _commandHistory = new ArrayList<>();

    public void addCommand(AbstractCommand command){
        _commandToExecute.add(command);
    }
    public void removeCommand(AbstractCommand command){
        for (AbstractCommand com:
             _commandToExecute) {
            if (com.equals(command)){
                _commandToExecute.remove(command);
            }
        }
    }
    public void undoCommand(AbstractCommand command){
        for (AbstractCommand com:
             _commandHistory) {
            if (com.equals(command)){
                _commandHistory.remove(command);
            }
        }
    }
    public void executeAllPendingCommand(){
        for (AbstractCommand com:
             _commandToExecute) {
            _commandHistory.add(com);
        }
        _commandToExecute.clear();
    }
    public void undoChanges(int changesToUndo){
        for (int i = 0; i <= changesToUndo; i++){
            _commandHistory.removeLast();
        }
    }

    public ArrayList<AbstractCommand> get_commandHistory() {
        return _commandHistory;
    }
}
