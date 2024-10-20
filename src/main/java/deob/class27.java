package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("be")
public class class27 {

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.at(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method396(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("be.ah(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method388(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("be.ar(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method390(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
