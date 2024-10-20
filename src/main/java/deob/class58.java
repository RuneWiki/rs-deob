package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("bu")
public class class58 {

    @ObfuscatedName("bu.d")
    public static Applet field668 = null;

    @ObfuscatedName("bu.z")
    public static String field669 = "";

    public class58() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.d(Ljava/lang/String;ZZB)V")
    public static void method89(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method4443(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field669.startsWith("win") && !arg2) {
            method4443(arg0, 0, "openjs");
        } else if (field669.startsWith("mac")) {
            method4443(arg0, 1, "openjs");
        } else {
            method4443(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("jh.z(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method4443(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field669.startsWith("win")) {
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
                Object var6 = class54.method684(field668, arg2, new Object[] { (new URL(field668.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field668.getAppletContext().showDocument(new URL(field668.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class54.method683(field668, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field668.getAppletContext().showDocument(new URL(field668.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
