package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("al")
public class class48 {

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.s(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method673(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("al.j(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method672(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
