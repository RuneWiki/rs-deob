package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ey")
public class class142 {

    @ObfuscatedName("ey.e")
    public static Applet field2188 = null;

    @ObfuscatedName("ey.l")
    public static String field2182 = null;

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.e(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2707(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method3214(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2182.startsWith("win") && !arg3) {
            method3214(arg0, 0);
            return;
        }
        if (field2182.startsWith("mac")) {
            method2342(arg0, 1, arg2);
            return;
        }
        method3214(arg0, 2);
    }

    @ObfuscatedName("fe.l(Ljava/lang/String;II)Z")
    public static boolean method3214(String arg0, int arg1) {
        return method2342(arg0, arg1, "openjs");
    }

    @ObfuscatedName("dc.c(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2342(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2182.startsWith("win")) {
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
                Applet var6 = field2188;
                Object[] var7 = new Object[] { (new URL(field2188.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2188.getAppletContext().showDocument(new URL(field2188.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class136.method2818(field2188, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field2188.getAppletContext().showDocument(new URL(field2188.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
