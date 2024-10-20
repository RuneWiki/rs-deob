package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ef")
public class class136 {

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.e(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2812(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ef.l(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method2818(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
