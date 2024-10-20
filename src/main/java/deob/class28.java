package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("af")
public class class28 {

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.c(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method390(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("af.l(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method391(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("af.s(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method392(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
