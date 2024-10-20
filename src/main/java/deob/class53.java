package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bg")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.p(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method664(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
