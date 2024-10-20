package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bl")
public class class57 {

    @ObfuscatedName("bl.s")
    public static Applet field677 = null;

    @ObfuscatedName("bl.c")
    public static String field675 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.s(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method973(Applet arg0, String arg1) {
        field677 = arg0;
        field675 = arg1;
    }

    @ObfuscatedName("l.c(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method116(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method14(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field675.startsWith("win") && !arg3) {
            method14(arg0, 0);
            return;
        }
        if (field675.startsWith("mac")) {
            method166(arg0, 1, arg2);
            return;
        }
        method14(arg0, 2);
    }

    @ObfuscatedName("h.f(Ljava/lang/String;IB)Z")
    public static boolean method14(String arg0, int arg1) {
        return method166(arg0, arg1, "openjs");
    }

    @ObfuscatedName("b.m(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method166(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field675.startsWith("win")) {
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
                Applet var6 = field677;
                Object[] var7 = new Object[] { (new URL(field677.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field677.getAppletContext().showDocument(new URL(field677.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class53.method669(field677, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field677.getAppletContext().showDocument(new URL(field677.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
