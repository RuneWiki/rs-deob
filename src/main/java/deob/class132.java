package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("et")
public class class132 {

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.a(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2680(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
