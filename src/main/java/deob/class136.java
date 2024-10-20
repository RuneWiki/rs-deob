package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ec")
public class class136 {

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.f(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2730(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ec.e(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2719(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("ec.n(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;S)Ljava/lang/Object;")
    public static Object method2722(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
