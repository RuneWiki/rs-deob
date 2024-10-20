package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bs")
public class class57 {

    @ObfuscatedName("bs.e")
    public static Applet field683 = null;

    @ObfuscatedName("bs.o")
    public static String field681 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fi.e(Ljava/lang/String;ZZS)V")
    public static void method2717(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method3724(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field681.startsWith("win") && !arg2) {
            method3724(arg0, 0);
        } else if (field681.startsWith("mac")) {
            method454(arg0, 1, "openjs");
        } else {
            method3724(arg0, 2);
        }
    }

    @ObfuscatedName("hl.o(Ljava/lang/String;II)Z")
    public static boolean method3724(String arg0, int arg1) {
        return method454(arg0, arg1, "openjs");
    }

    @ObfuscatedName("al.m(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method454(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field681.startsWith("win")) {
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
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class53.method672(field683, arg2, new Object[] { (new URL(field683.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field683.getAppletContext().showDocument(new URL(field683.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field683;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field683.getAppletContext().showDocument(new URL(field683.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
