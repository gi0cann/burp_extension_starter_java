package burp;

import java.io.PrintWriter;

public class BurpExtender implements IBurpExtender
{

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks)
    {
        PrintWriter stdout = new PrintWriter(callbacks.getStdout(), true);
        PrintWriter stderr = new PrintWriter(callbacks.getStderr(), true);
        callbacks.setExtensionName("Extension starter");
        stdout.println("Hello world!");
        stderr.println("Hello world!");
    }

}
