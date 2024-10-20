package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bw")
public class class54 {

    public class54() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.c(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method708(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("bw.i(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method710(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
