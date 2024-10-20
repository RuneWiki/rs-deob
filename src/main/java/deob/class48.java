package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("aj")
public class class48 {

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.z(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method724(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("aj.n(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method725(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
