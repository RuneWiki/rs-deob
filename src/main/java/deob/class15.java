package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("a")
public class class15 {

    public class15() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.s(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method143(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("a.t(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method144(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("a.v(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method151(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
