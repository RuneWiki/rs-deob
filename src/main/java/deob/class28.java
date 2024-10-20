package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ad")
public class class28 {

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.l(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method398(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ad.q(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method399(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
