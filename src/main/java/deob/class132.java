package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("eq")
public class class132 {

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.n(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method2669(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("eq.d(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2675(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
