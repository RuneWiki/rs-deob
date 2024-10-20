package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("az")
public class class43 {

    public class43() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.f(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method329(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("az.o(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method333(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("az.u(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method335(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
