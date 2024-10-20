package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("ey")
public class class139 {

    @ObfuscatedName("ey.e")
    public static Applet field2124 = null;

    @ObfuscatedName("ey.w")
    public static String field2123 = null;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.e(Ljava/lang/String;ZZI)V")
    public static void method2898(String arg0, boolean arg1, boolean arg2) {
        method3201(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("fc.w(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method3201(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method873(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2123.startsWith("win") && !arg3) {
            method873(arg0, 0);
            return;
        }
        if (field2123.startsWith("mac")) {
            method2038(arg0, 1, arg2);
            return;
        }
        method873(arg0, 2);
    }

    @ObfuscatedName("aa.f(Ljava/lang/String;II)Z")
    public static boolean method873(String arg0, int arg1) {
        return method2038(arg0, arg1, "openjs");
    }

    @ObfuscatedName("cs.s(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2038(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2123.startsWith("win")) {
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
                Object var6 = class133.method2664(field2124, arg2, new Object[] { (new URL(field2124.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2124.getAppletContext().showDocument(new URL(field2124.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Statics.method2663(field2124, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2124.getAppletContext().showDocument(new URL(field2124.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
