package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bm")
public class class61 {

    @ObfuscatedName("bm.h")
    public static Applet field441 = null;

    @ObfuscatedName("bm.v")
    public static String field440 = "";

    public class61() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.h(Ljava/lang/String;ZZI)V")
    public static void method1978(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method1139(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field440.startsWith("win") && !arg2) {
            method1139(arg0, 0);
        } else if (field440.startsWith("mac")) {
            method109(arg0, 1, "openjs");
        } else {
            method1139(arg0, 2);
        }
    }

    @ObfuscatedName("bb.v(Ljava/lang/String;IB)Z")
    public static boolean method1139(String arg0, int arg1) {
        return method109(arg0, arg1, "openjs");
    }

    @ObfuscatedName("c.x(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method109(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field440.startsWith("win")) {
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
                Applet var6 = field441;
                Object[] var7 = new Object[] { (new URL(field441.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field441.getAppletContext().showDocument(new URL(field441.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class57.method780(field441, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field441.getAppletContext().showDocument(new URL(field441.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
