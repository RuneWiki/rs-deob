package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("bh")
public class class32 {

    @ObfuscatedName("bh.aj")
    public static Applet field167 = null;

    @ObfuscatedName("bh.al")
    public static String field162 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.aj(Ljava/lang/String;ZZI)V")
    public static void method367(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method3097(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field162.startsWith("win") && !arg2) {
            method3097(arg0, 0, "openjs");
        } else if (field162.startsWith("mac")) {
            method3097(arg0, 1, "openjs");
        } else {
            method3097(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("gr.al(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method3097(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field162.startsWith("win")) {
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
                Object var6 = class27.method371(field167, arg2, new Object[] { (new URL(field167.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field167.getAppletContext().showDocument(new URL(field167.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Statics.method368(field167, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field167.getAppletContext().showDocument(new URL(field167.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
