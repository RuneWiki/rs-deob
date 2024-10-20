package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bh")
public class class57 {

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.z(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method755(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
