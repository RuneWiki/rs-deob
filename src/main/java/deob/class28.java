package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ad")
public class class28 {

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.h(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method380(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ad.e(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method381(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
