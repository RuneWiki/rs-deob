package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ac")
public class class30 {

    @ObfuscatedName("ac.o")
    public static Applet field171 = null;

    @ObfuscatedName("ac.q")
    public static String field169 = "";

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.o(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method1891(Applet arg0, String arg1) {
        field171 = arg0;
        if (arg1 != null) {
            field169 = arg1;
        }
    }

    @ObfuscatedName("cr.q(Ljava/lang/String;ZZI)V")
    public static void method1979(String arg0, boolean arg1, boolean arg2) {
        method1568(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("bx.l(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method1568(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method5113(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field169.startsWith("win") && !arg3) {
            method5113(arg0, 0, "openjs");
            return;
        }
        if (field169.startsWith("mac")) {
            method5113(arg0, 1, arg2);
            return;
        }
        method5113(arg0, 2, "openjs");
    }

    @ObfuscatedName("kj.k(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method5113(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field169.startsWith("win")) {
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
            } catch (Throwable var14) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field171;
                Object[] var7 = new Object[] { (new URL(field171.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field171.getAppletContext().showDocument(new URL(field171.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class28.method363(field171, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field171.getAppletContext().showDocument(new URL(field171.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
