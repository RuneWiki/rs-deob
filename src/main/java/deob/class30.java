package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("av")
public class class30 {

    @ObfuscatedName("av.c")
    public static Applet field178 = null;

    @ObfuscatedName("av.l")
    public static String field176 = "";

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.c(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method1902(Applet arg0, String arg1) {
        field178 = arg0;
        if (arg1 != null) {
            field176 = arg1;
        }
    }

    @ObfuscatedName("fi.l(Ljava/lang/String;ZZI)V")
    public static void method2812(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method2295(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field176.startsWith("win") && !arg2) {
            method2295(arg0, 0, "openjs");
        } else if (field176.startsWith("mac")) {
            method2295(arg0, 1, "openjs");
        } else {
            method2295(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("cz.s(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method2295(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field176.startsWith("win")) {
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
                Object var6 = class28.method392(field178, arg2, new Object[] { (new URL(field178.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field178.getAppletContext().showDocument(new URL(field178.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field178;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field178.getAppletContext().showDocument(new URL(field178.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
