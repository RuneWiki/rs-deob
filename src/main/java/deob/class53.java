package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bw")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.p(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method673(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
