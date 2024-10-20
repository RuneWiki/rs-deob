package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("eb")
public class class136 {

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.a(Ljava/applet/Applet;Ljava/lang/String;S)Ljava/lang/Object;")
    public static Object method2749(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
