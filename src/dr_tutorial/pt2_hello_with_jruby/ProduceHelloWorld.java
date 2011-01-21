package dr_tutorial.hello_with_jruby;

// Imports
import com.pervasive.datarush.operators.DataflowProcess;
import com.pervasive.datarush.operators.CompositionContext;
import com.pervasive.datarush.ports.StringOutput;
import com.pervasive.datarush.flows.ScalarFlow;

// JRuby Imports
import org.apache.bsf.BSFManager;
import org.apache.bsf.util.IOUtils;
import org.jruby.Ruby;
import org.jruby.javasupport.Java;
import org.jruby.javasupport.JavaEmbedUtils;
import org.jruby.javasupport.JavaUtil;
import org.jruby.runtime.Block;
import org.jruby.runtime.GlobalVariable;
import org.jruby.runtime.builtin.IRubyObject;

// File Support
import java.io.FileReader;
import java.io.IOException;



// public class ProduceHelloWorld extends DataflowProcess {
// 
//   StringOutput generateHelloWorld;
//   public ProduceHelloWorld(CompositionContext ctx) {
//     super(ctx);
//     generateHelloWorld = newStringOutput("helloWorldOutputPort");
//   }
//   public ScalarFlow getOutput() {
//     return getFlow(generateHelloWorld);
//   }
//   @Override
//     protected void execute() {
//     
//     String greeting = "Hi!";
//     // greeting = Greeter.new.greeting();
//     
//     generateHelloWorld.push(greeting);
//     generateHelloWorld.pushEndOfData();
//   }
// }

// class CharSplitter
//   def process line, &block
//     line.chars.map do |char|
//       char + char
//     end                          
//   end
// end

  // 
// process do |line|
//   puts line
// end             
  
