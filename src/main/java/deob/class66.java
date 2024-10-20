package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bp")
public class class66 {

    public class66() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.g(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method1361(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
