package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("eo")
public class class142 {

    @ObfuscatedName("eo.s")
    public static Applet field2173 = null;

    @ObfuscatedName("eo.z")
    public static String field2177 = null;

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.s(Ljava/lang/String;ZZI)V")
    public static void method151(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method4(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field2177.startsWith("win") && !arg2) {
            method4(arg0, 0, "openjs");
        } else if (field2177.startsWith("mac")) {
            method4(arg0, 1, "openjs");
        } else {
            method4(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("s.z(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method4(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2177.startsWith("win")) {
                    throw new Exception();
                } else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
                    String var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    for (int var4 = 0; var4 < arg0.length(); var4++) {
                        if (var3.indexOf(arg0.charAt(var4)) == -1) {
                            throw new Exception();
                        }
                    }
                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
                    return true;
                } else {
                    throw new Exception();
                }
            } catch (Throwable var11) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class136.method2726(field2173, arg2, new Object[] { (new URL(field2173.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2173.getAppletContext().showDocument(new URL(field2173.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class136.method2721(field2173, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2173.getAppletContext().showDocument(new URL(field2173.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
