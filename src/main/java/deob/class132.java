package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("eg")
public class class132 {

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.d(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2711(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
