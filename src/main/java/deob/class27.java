package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bs")
public class class27 {

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.at(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method371(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
