package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bm")
public class class27 {

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.aj(Ljava/applet/Applet;Ljava/lang/String;S)V")
    public static void method375(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("bm.ac(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method371(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
