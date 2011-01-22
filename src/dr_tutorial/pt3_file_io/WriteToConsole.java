import com.pervasive.datarush.operators.DataflowProcess;
import com.pervasive.datarush.operators.CompositionContext;
import com.pervasive.datarush.flows.ScalarFlow;
import com.pervasive.datarush.ports.StringInput;


public class WriteToConsole extends DataflowProcess { 
    StringInput input;
    
    public WriteToConsole(CompositionContext ctx, ScalarFlow input) { 
        super(ctx);
        this.input = newStringInput(input);
    } 
 
 
  @Override 
  protected void execute() { 
      while (input.stepNext()) {
          System.out.println(input.asString());   
      }
          
  } 
} 
