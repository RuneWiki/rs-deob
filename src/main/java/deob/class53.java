package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ba")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.b(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method643(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("ba.s(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method647(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
