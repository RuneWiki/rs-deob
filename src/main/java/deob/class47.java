package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("at")
public class class47 {

    public class47() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.f(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method705(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }
}
