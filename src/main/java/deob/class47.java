package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("au")
public class class47 {

    public class47() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.m(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method712(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("au.f(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method713(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
