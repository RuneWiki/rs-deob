package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("ba")
public class class32 {

    @ObfuscatedName("ba.aq")
    public static Applet field165 = null;

    @ObfuscatedName("ba.aw")
    public static String field161 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.aq(Ljava/lang/String;ZZB)V")
    public static void method2989(String arg0, boolean arg1, boolean arg2) {
        method3071(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("fl.aw(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method3071(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            Statics.method7690(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field161.startsWith("win") && !arg3) {
            Statics.method7690(arg0, 0, "openjs");
            return;
        }
        if (field161.startsWith("mac")) {
            Statics.method7690(arg0, 1, arg2);
            return;
        }
        Statics.method7690(arg0, 2, "openjs");
    }
}
