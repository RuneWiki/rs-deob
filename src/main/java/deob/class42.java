package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("aq")
public class class42 {

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.w(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method678(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
