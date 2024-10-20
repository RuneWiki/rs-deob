package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("eg")
public class class133 {

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.f(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2690(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("eg.u(Ljava/applet/Applet;Ljava/lang/String;S)Ljava/lang/Object;")
    public static Object method2691(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("eg.x(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2697(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
