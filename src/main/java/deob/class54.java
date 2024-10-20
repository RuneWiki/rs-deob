package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("br")
public class class54 {

    public class54() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.d(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method683(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("br.z(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method684(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
