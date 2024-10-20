package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("av")
public class class42 {

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.z(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method623(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("av.w(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method621(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
