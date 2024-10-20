package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bg")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.n(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method668(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("bg.v(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method669(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("bg.y(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method673(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
