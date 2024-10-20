package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("bz")
public class class57 {

    @ObfuscatedName("bz.n")
    public static Applet field655 = null;

    @ObfuscatedName("bz.v")
    public static String field648 = "";

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.n(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method1075(Applet arg0, String arg1) {
        field655 = arg0;
        if (arg1 != null) {
            field648 = arg1;
        }
    }

    @ObfuscatedName("ee.v(Ljava/lang/String;ZZI)V")
    public static void method2716(String arg0, boolean arg1, boolean arg2) {
        method484(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("aa.y(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method484(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            Statics.method109(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field648.startsWith("win") && !arg3) {
            Statics.method109(arg0, 0, "openjs");
            return;
        }
        if (field648.startsWith("mac")) {
            Statics.method109(arg0, 1, arg2);
            return;
        }
        Statics.method109(arg0, 2, "openjs");
    }
}
