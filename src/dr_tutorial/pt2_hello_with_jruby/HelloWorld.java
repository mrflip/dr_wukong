// JRuby Imports
import org.jruby.embed.ScriptingContainer;

public class HelloWorld {

  private HelloWorld() {
    ScriptingContainer container = new ScriptingContainer();
    container.runScriptlet("puts \"Hello World!\"");
  }

  public static void main(String[] args) {
    new HelloWorld();
  }
}

// // Imports
// import com.pervasive.datarush.operators.DataflowOperator;
// import com.pervasive.datarush.operators.CompositionContext;
// import com.pervasive.datarush.operators.sink.LogRows;
// 
// public class HelloWorld extends DataflowOperator {
//   @Override
//     protected void compose(CompositionContext ctx) {
//     ProduceHelloWorld hw = ctx.add(new ProduceHelloWorld(ctx));
//     ctx.add(new LogRows(hw.getOutput(), 1));
//   }
// }
