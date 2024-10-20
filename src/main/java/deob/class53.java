package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bj")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.d(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method692(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("bj.k(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method694(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("bj.e(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method695(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
