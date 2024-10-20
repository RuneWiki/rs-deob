package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ev")
public class class133 {

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.j(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2669(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ev.h(Ljava/applet/Applet;Ljava/lang/String;S)Ljava/lang/Object;")
    public static Object method2670(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("ev.m(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2671(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
