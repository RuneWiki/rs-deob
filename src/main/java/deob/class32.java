package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("bm")
public class class32 {

    @ObfuscatedName("bm.ac")
    public static Applet field148 = null;

    @ObfuscatedName("bm.ae")
    public static String field144 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ia.ac(Ljava/lang/String;ZZI)V")
    public static void method3941(String arg0, boolean arg1, boolean arg2) {
        method864(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("bo.ae(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method864(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            Statics.method3085(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field144.startsWith("win") && !arg3) {
            Statics.method3085(arg0, 0, "openjs");
            return;
        }
        if (field144.startsWith("mac")) {
            Statics.method3085(arg0, 1, arg2);
            return;
        }
        Statics.method3085(arg0, 2, "openjs");
    }
}
