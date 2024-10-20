package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("aq")
public class class28 {

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.v(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method378(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
