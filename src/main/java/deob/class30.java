package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("an")
public class class30 {

    @ObfuscatedName("an.c")
    public static Applet field173 = null;

    @ObfuscatedName("an.b")
    public static String field178 = "";

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hq.c(Ljava/lang/String;ZZI)V")
    public static void method4390(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            Statics.method2209(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field178.startsWith("win") && !arg2) {
            Statics.method2209(arg0, 0, "openjs");
        } else if (field178.startsWith("mac")) {
            Statics.method2209(arg0, 1, "openjs");
        } else {
            Statics.method2209(arg0, 2, "openjs");
        }
    }
}
