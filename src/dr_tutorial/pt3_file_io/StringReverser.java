import com.pervasive.datarush.operators.DataflowProcess;
import com.pervasive.datarush.ports.StringInput;
import com.pervasive.datarush.ports.StringOutput;
import com.pervasive.datarush.operators.CompositionContext;
import com.pervasive.datarush.flows.ScalarFlow;

public class StringReverser extends DataflowProcess { 
    
    private final StringInput  input; 
    private final StringOutput output; 
    
    public StringReverser(CompositionContext ctx, ScalarFlow input) { 
        super(ctx); 
        this.input = newStringInput(input, "reverserInputPort"); 
        this.output = newStringOutput("reverserOutputPort"); 
    } 
    
    public ScalarFlow getOutput() { 
        return getFlow(this.output); 
    } 
    
    @Override 
    protected void execute() { 
        while (input.stepNext()) { 
            StringBuilder sb = new StringBuilder(input.asString()); 
            output.push(sb.reverse().toString()); 
        } 
        output.pushEndOfData(); 
    } 
} 
