package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ah")
public class class52 {

    @ObfuscatedName("ah.c")
    public static Applet field434 = null;

    @ObfuscatedName("ah.t")
    public static String field432 = "";

    public class52() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hl.c(Ljava/lang/String;ZZI)V")
    public static void method3723(String arg0, boolean arg1, boolean arg2) {
        method2663(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("dz.t(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method2663(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method3361(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field432.startsWith("win") && !arg3) {
            method3361(arg0, 0);
            return;
        }
        if (field432.startsWith("mac")) {
            method154(arg0, 1, arg2);
            return;
        }
        method3361(arg0, 2);
    }

    @ObfuscatedName("gi.o(Ljava/lang/String;II)Z")
    public static boolean method3361(String arg0, int arg1) {
        return method154(arg0, arg1, "openjs");
    }

    @ObfuscatedName("x.e(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method154(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field432.startsWith("win")) {
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
                Applet var6 = field434;
                Object[] var7 = new Object[] { (new URL(field434.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field434.getAppletContext().showDocument(new URL(field434.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class48.method710(field434, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field434.getAppletContext().showDocument(new URL(field434.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
