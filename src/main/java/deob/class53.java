package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("br")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.w(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method676(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
