package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("as")
public class class43 {

    public class43() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.f(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method362(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("as.e(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method358(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
