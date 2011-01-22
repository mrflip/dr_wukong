import com.pervasive.datarush.operators.DataflowProcess;
import com.pervasive.datarush.ports.StringOutput;
import com.pervasive.datarush.operators.CompositionContext;
import com.pervasive.datarush.operators.io.textfile.ReadText;
import com.pervasive.datarush.operators.io.textfile.ReadTextProperties;
import com.pervasive.datarush.flows.ScalarFlow;


public class ReadFromFile extends DataflowProcess { 
    private ReadText reader;
    
    public ReadFromFile(CompositionContext ctx) { 
        super(ctx);
        reader = new ReadText("SROutput.txt", new ReadTextProperties());
        ctx.add(reader);
    } 
 
  public ScalarFlow getOutput() { 
    return reader.getOutput(); 
  } 
 
  @Override 
  protected void execute() { 
  } 
} 
