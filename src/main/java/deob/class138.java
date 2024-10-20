package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("er")
public class class138 {

    @ObfuscatedName("er.z")
    public static Applet field2134 = null;

    @ObfuscatedName("er.q")
    public static String field2135 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.z(Ljava/lang/String;ZZB)V")
    public static void method2096(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method621(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field2135.startsWith("win") && !arg2) {
            method621(arg0, 0);
        } else if (field2135.startsWith("mac")) {
            method943(arg0, 1, "openjs");
        } else {
            method621(arg0, 2);
        }
    }

    @ObfuscatedName("al.q(Ljava/lang/String;II)Z")
    public static boolean method621(String arg0, int arg1) {
        return method943(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ar.k(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method943(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2135.startsWith("win")) {
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
                Applet var6 = field2134;
                Object[] var7 = new Object[] { (new URL(field2134.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2134.getAppletContext().showDocument(new URL(field2134.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class132.method2642(field2134, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field2134.getAppletContext().showDocument(new URL(field2134.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
