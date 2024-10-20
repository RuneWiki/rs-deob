package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bv")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.n(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method666(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("bv.p(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method671(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("bv.i(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;S)Ljava/lang/Object;")
    public static Object method667(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
