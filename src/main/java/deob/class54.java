package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bx")
public class class54 {

    public class54() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.o(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method711(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("bx.k(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method707(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
