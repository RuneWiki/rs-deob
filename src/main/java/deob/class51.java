package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("af")
public class class51 {

    @ObfuscatedName("af.m")
    public static Applet field411 = null;

    @ObfuscatedName("af.f")
    public static String field404 = "";

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.m(Ljava/lang/String;ZZI)V")
    public static void method544(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method5452(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field404.startsWith("win") && !arg2) {
            method5452(arg0, 0);
        } else if (field404.startsWith("mac")) {
            Statics.method2979(arg0, 1, "openjs");
        } else {
            method5452(arg0, 2);
        }
    }

    @ObfuscatedName("lw.f(Ljava/lang/String;II)Z")
    public static boolean method5452(String arg0, int arg1) {
        return Statics.method2979(arg0, arg1, "openjs");
    }
}
