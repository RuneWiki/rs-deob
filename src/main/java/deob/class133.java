package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ek")
public class class133 {

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.w(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2664(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
