package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("eg")
public class class138 {

    @ObfuscatedName("eg.o")
    public static Applet field2133 = null;

    @ObfuscatedName("eg.e")
    public static String field2127 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.o(Ljava/lang/String;ZZI)V")
    public static void method49(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method2651(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field2127.startsWith("win") && !arg2) {
            method2651(arg0, 0, "openjs");
        } else if (field2127.startsWith("mac")) {
            method2651(arg0, 1, "openjs");
        } else {
            method2651(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("dn.e(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2651(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2127.startsWith("win")) {
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
                Object var6 = class132.method2682(field2133, arg2, new Object[] { (new URL(field2133.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2133.getAppletContext().showDocument(new URL(field2133.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Statics.method2680(field2133, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2133.getAppletContext().showDocument(new URL(field2133.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
