package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("eb")
public class class138 {

    @ObfuscatedName("eb.m")
    public static Applet field2107 = null;

    @ObfuscatedName("eb.l")
    public static String field2102 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.m(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method193(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method1273(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2102.startsWith("win") && !arg3) {
            method1273(arg0, 0);
            return;
        }
        if (field2102.startsWith("mac")) {
            method2307(arg0, 1, arg2);
            return;
        }
        method1273(arg0, 2);
    }

    @ObfuscatedName("br.l(Ljava/lang/String;IB)Z")
    public static boolean method1273(String arg0, int arg1) {
        return method2307(arg0, arg1, "openjs");
    }

    @ObfuscatedName("dk.y(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2307(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2102.startsWith("win")) {
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
                Object var6 = class132.method2718(field2107, arg2, new Object[] { (new URL(field2107.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2107.getAppletContext().showDocument(new URL(field2107.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field2107;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field2107.getAppletContext().showDocument(new URL(field2107.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
