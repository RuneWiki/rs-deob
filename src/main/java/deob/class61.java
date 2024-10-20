package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("bt")
public class class61 {

    @ObfuscatedName("bt.x")
    public static Applet field462 = null;

    @ObfuscatedName("bt.m")
    public static String field463 = "";

    public class61() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.x(Ljava/lang/String;ZZI)V")
    public static void method2135(String arg0, boolean arg1, boolean arg2) {
        method3758(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("hm.m(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method3758(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method276(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field463.startsWith("win") && !arg3) {
            method276(arg0, 0);
            return;
        }
        if (field463.startsWith("mac")) {
            Statics.method1118(arg0, 1, arg2);
            return;
        }
        method276(arg0, 2);
    }

    @ObfuscatedName("an.k(Ljava/lang/String;II)Z")
    public static boolean method276(String arg0, int arg1) {
        return Statics.method1118(arg0, arg1, "openjs");
    }
}
