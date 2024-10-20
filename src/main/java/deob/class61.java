package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bw")
public class class61 {

    @ObfuscatedName("bw.n")
    public static Applet field452 = null;

    @ObfuscatedName("bw.v")
    public static String field455 = "";

    public class61() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.n(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method774(Applet arg0, String arg1) {
        field452 = arg0;
        if (arg1 != null) {
            field455 = arg1;
        }
    }

    @ObfuscatedName("aq.v(Ljava/lang/String;ZZI)V")
    public static void method324(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method1810(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field455.startsWith("win") && !arg2) {
            method1810(arg0, 0);
        } else if (field455.startsWith("mac")) {
            method3558(arg0, 1, "openjs");
        } else {
            method1810(arg0, 2);
        }
    }

    @ObfuscatedName("cf.d(Ljava/lang/String;II)Z")
    public static boolean method1810(String arg0, int arg1) {
        return method3558(arg0, arg1, "openjs");
    }

    @ObfuscatedName("gc.c(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method3558(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field455.startsWith("win")) {
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
                Object var6 = class57.method785(field452, arg2, new Object[] { (new URL(field452.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field452.getAppletContext().showDocument(new URL(field452.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field452;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field452.getAppletContext().showDocument(new URL(field452.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
