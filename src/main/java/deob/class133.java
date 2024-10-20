package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ej")
public class class133 {

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.b(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2701(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ej.g(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2703(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("ej.j(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method2704(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
