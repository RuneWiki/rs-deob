package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("br")
public class class57 {

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.n(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method790(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("br.v(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method785(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
