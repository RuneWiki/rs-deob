package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bl")
public class class57 {

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bl.h(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method780(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
