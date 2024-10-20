package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ao")
public class class48 {

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.a(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method748(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ao.t(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method749(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
