
import org.nlogo.headless.HeadlessWorkspace

object Test extends App {


  def main(file: String) = {
     //test_many_open(file)
    val ws = HeadlessWorkspace.newInstance
    try {
      ws.open(file)
      run(ws, "setup")
      run(ws, "while [ticks <= 24 and count mosquitoes > 0] [ headless-go ]")
    } finally ws.dispose()
  }


  def run(ws: HeadlessWorkspace,command: String): Unit = {
    ws.command(command)
  }

  main(args(0))
  //main(modelFile)

}
