package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ah")
public class class43 {

    public class43() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.v(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method321(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ah.n(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method322(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("ah.f(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;S)Ljava/lang/Object;")
    public static Object method323(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
