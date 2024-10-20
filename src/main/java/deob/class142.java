package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ea")
public class class142 {

    @ObfuscatedName("ea.a")
    public static Applet field2205 = null;

    @ObfuscatedName("ea.d")
    public static String field2206 = null;

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.a(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2300(Applet arg0, String arg1) {
        field2205 = arg0;
        field2206 = arg1;
    }

    @ObfuscatedName("cb.d(Ljava/lang/String;ZZS)V")
    public static void method1595(String arg0, boolean arg1, boolean arg2) {
        method628(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("as.v(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method628(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method159(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2206.startsWith("win") && !arg3) {
            method159(arg0, 0);
            return;
        }
        if (field2206.startsWith("mac")) {
            method553(arg0, 1, arg2);
            return;
        }
        method159(arg0, 2);
    }

    @ObfuscatedName("j.r(Ljava/lang/String;IS)Z")
    public static boolean method159(String arg0, int arg1) {
        return method553(arg0, arg1, "openjs");
    }

    @ObfuscatedName("s.z(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method553(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2206.startsWith("win")) {
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
                Applet var6 = field2205;
                Object[] var7 = new Object[] { (new URL(field2205.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2205.getAppletContext().showDocument(new URL(field2205.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class136.method2749(field2205, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field2205.getAppletContext().showDocument(new URL(field2205.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
