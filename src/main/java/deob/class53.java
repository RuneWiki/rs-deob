package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bk")
public class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.j(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method703(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("bk.h(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;S)Ljava/lang/Object;")
    public static Object method704(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
