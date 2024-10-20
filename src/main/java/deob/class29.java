package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("af")
public class class29 {

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.q(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method349(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
