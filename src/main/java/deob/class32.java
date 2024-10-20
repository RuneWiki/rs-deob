package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("bx")
public class class32 {

    @ObfuscatedName("bx.af")
    public static Applet field175 = null;

    @ObfuscatedName("bx.an")
    public static String field176 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pi.af(Ljava/lang/String;ZZB)V")
    public static void method7266(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method3940(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field176.startsWith("win") && !arg2) {
            method1157(arg0, 0);
        } else if (field176.startsWith("mac")) {
            method3940(arg0, 1, "openjs");
        } else {
            method3940(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("cf.an(Ljava/lang/String;II)Z")
    public static boolean method1157(String arg0, int arg1) {
        return method3940(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ia.aw(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method3940(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field176.startsWith("win")) {
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
                Object var6 = class27.method387(field175, arg2, new Object[] { (new URL(field175.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field175.getAppletContext().showDocument(new URL(field175.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class27.method386(field175, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field175.getAppletContext().showDocument(new URL(field175.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
