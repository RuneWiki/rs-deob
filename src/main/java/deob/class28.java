package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ae")
public class class28 {

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.i(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method385(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ae.w(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method386(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
