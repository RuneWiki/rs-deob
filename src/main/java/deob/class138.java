package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("el")
public class class138 {

    @ObfuscatedName("el.i")
    public static Applet field2124 = null;

    @ObfuscatedName("el.v")
    public static String field2121 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.i(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method660(Applet arg0, String arg1) {
        field2124 = arg0;
        field2121 = arg1;
    }

    @ObfuscatedName("dm.v(Ljava/lang/String;ZLjava/lang/String;ZS)V")
    public static void method2643(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            Statics.method161(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2121.startsWith("win") && !arg3) {
            Statics.method161(arg0, 0, "openjs");
            return;
        }
        if (field2121.startsWith("mac")) {
            Statics.method161(arg0, 1, arg2);
            return;
        }
        Statics.method161(arg0, 2, "openjs");
    }
}
