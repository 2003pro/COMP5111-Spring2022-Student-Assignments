/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 18 12:47:29 GMT 2022
 */

package comp5111.assignment.cut;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Subject_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "comp5111.assignment.cut.Subject"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/Users/zhangjipeng/COMP5111-Spring2022-Student-Assignments"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/nq/x_d41cg55fxd08c7dnc38qwh0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Subject_ESTest_scaffolding.class.getClassLoader() ,
      "comp5111.assignment.cut.Subject$Progressable",
      "comp5111.assignment.cut.Subject$PrimUtils",
      "comp5111.assignment.cut.Subject$UrlUtils",
      "comp5111.assignment.cut.Subject$HeapSort",
      "comp5111.assignment.cut.Subject$Check",
      "comp5111.assignment.cut.Subject$IndexedSortable",
      "comp5111.assignment.cut.Subject$BooleanUtils",
      "comp5111.assignment.cut.Subject$StringUtils",
      "comp5111.assignment.cut.Subject",
      "comp5111.assignment.cut.Subject$IndexedSorter",
      "comp5111.assignment.cut.Subject$PrimUtils$IntComparator",
      "comp5111.assignment.cut.Subject$StrUtils"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("comp5111.assignment.cut.Subject$IndexedSortable", false, Subject_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("comp5111.assignment.cut.Subject$PrimUtils$IntComparator", false, Subject_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("comp5111.assignment.cut.Subject$Progressable", false, Subject_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Subject_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "comp5111.assignment.cut.Subject",
      "comp5111.assignment.cut.Subject$StrUtils",
      "comp5111.assignment.cut.Subject$StringUtils",
      "comp5111.assignment.cut.Subject$BooleanUtils",
      "comp5111.assignment.cut.Subject$Check",
      "comp5111.assignment.cut.Subject$UrlUtils",
      "comp5111.assignment.cut.Subject$PrimUtils",
      "comp5111.assignment.cut.Subject$HeapSort",
      "comp5111.assignment.cut.Subject$PrimUtils$IntComparator"
    );
  }
}
