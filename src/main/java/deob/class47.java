package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ao")
public class class47 {

    public class47() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.a(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method704(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
