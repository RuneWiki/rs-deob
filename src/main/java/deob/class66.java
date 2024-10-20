package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("br")
public class class66 {

    public class66() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.z(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method1344(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
