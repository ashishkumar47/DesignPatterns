import java.util.Stack;

/**
 * @ author  ashishKumar
 * @ since 13-04-2024 07:12 pm
 */
public class RemoteControl {

    ICommand iCommand;
    Stack<ICommand> commandStack= new Stack<>();

    public void setCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void executeCommand() {
        this.iCommand.execute();
        commandStack.push(iCommand);
    }
    public void unDo(){
        if(!commandStack.empty()){
            commandStack.pop().unDo();
        }
    }

}
