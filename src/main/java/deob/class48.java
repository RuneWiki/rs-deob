package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ag")
public class class48 {

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.c(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method710(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
