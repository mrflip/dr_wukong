// package dr_tutorial.hello_with_jruby;

// Imports
// import com.pervasive.datarush.operators.DataflowProcess;
// import com.pervasive.datarush.operators.CompositionContext;
// import com.pervasive.datarush.ports.StringOutput;
// import com.pervasive.datarush.flows.ScalarFlow;

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
  
