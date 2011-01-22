import com.pervasive.datarush.operators.DataflowProcess;
import com.pervasive.datarush.ports.StringOutput;
import com.pervasive.datarush.operators.CompositionContext;
import com.pervasive.datarush.operators.io.textfile.WriteText;
import com.pervasive.datarush.operators.io.textfile.ReadText;
import com.pervasive.datarush.operators.io.textfile.ReadTextProperties;
import com.pervasive.datarush.flows.ScalarFlow;


public class WriteToFile extends DataflowProcess { 
 
    public WriteToFile(CompositionContext ctx, ScalarFlow input) { 
        super(ctx);         
        ctx.add(new WriteText(input, "reversed_output.txt"));
    } 
 
 
  @Override 
  protected void execute() { 
  } 
} 
