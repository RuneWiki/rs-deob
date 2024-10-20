package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ay")
public class class48 {

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.f(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method714(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
