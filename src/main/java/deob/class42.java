package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ap")
public class class42 {

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.f(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method662(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
