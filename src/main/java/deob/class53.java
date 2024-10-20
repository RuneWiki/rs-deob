package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bp")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.i(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method705(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("bp.j(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method706(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
