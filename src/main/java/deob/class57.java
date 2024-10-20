package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("bx")
public class class57 {

    @ObfuscatedName("bx.n")
    public static Applet field668 = null;

    @ObfuscatedName("bx.p")
    public static String field670 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.n(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method88(Applet arg0, String arg1) {
        field668 = arg0;
        field670 = arg1;
    }

    @ObfuscatedName("z.p(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method42(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method618(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field670.startsWith("win") && !arg3) {
            method618(arg0, 0, "openjs");
            return;
        }
        if (field670.startsWith("mac")) {
            method618(arg0, 1, arg2);
            return;
        }
        method618(arg0, 2, "openjs");
    }

    @ObfuscatedName("aj.i(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method618(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field670.startsWith("win")) {
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
                Object var6 = class53.method667(field668, arg2, new Object[] { (new URL(field668.getCodeBase(), arg0)).toString() });
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
                class53.method671(field668, "loggedout");
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
