import com.pervasive.datarush.operators.DataflowOperator;
import com.pervasive.datarush.operators.CompositionContext;
import com.pervasive.datarush.operators.sink.LogRows;

// Imports 
public class HelloWorld extends DataflowOperator {  
 
    @Override 
    protected void compose(CompositionContext ctx) { 
        ReadFromFile reader = ctx.add(new ReadFromFile(ctx)); 
        StringReverser reverser = ctx.add(new StringReverser(ctx, reader.getOutput()));
        WriteToConsole writer = ctx.add(new WriteToConsole(ctx, reverser.getOutput()));  
        //WriteToFile writer = ctx.add(new WriteToFile(ctx, reverser.getOutput()));  

        //ctx.add(new LogRows(reader.getOutput(), 1)); 
    } 
} 

