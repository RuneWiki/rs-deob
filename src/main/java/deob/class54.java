package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bi")
public class class54 {

    public class54() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.g(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method738(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
