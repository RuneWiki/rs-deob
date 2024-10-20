package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("an")
public class class28 {

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.a(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method393(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("an.f(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method397(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
