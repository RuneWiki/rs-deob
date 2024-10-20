package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("by")
public class class27 {

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.af(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method385(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("by.an(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method386(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("by.aw(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method387(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
