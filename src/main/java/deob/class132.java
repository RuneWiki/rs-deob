package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ew")
public class class132 {

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.o(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method2621(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
