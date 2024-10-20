package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bk")
public class class57 {

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.x(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method794(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
