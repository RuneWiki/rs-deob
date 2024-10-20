package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ak")
public class class28 {

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.c(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method341(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
