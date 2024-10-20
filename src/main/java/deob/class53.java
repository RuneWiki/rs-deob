package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bk")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.s(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method669(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
