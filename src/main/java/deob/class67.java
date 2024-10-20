package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bp")
public class class67 {

    public class67() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.t(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method1386(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
