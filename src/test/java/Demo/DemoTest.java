package Demo;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DemoTest 
{
      @Test(groups="smoke")
      public void movieTest()
      {
    	  System.out.println("Toxic");
    	  System.out.println("Kgf");
      }
}
