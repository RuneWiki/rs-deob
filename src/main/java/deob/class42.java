package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("aq")
public class class42 {

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.y(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method649(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("aq.c(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method650(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
