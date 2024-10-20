package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("eu")
public class class138 {

    @ObfuscatedName("eu.a")
    public static Applet field2127 = null;

    @ObfuscatedName("eu.r")
    public static String field2124 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.a(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method613(Applet arg0, String arg1) {
        field2127 = arg0;
        field2124 = arg1;
    }

    @ObfuscatedName("ac.r(Ljava/lang/String;ZZI)V")
    public static void method695(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method2278(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field2124.startsWith("win") && !arg2) {
            method2278(arg0, 0);
        } else if (field2124.startsWith("mac")) {
            method2655(arg0, 1, "openjs");
        } else {
            method2278(arg0, 2);
        }
    }

    @ObfuscatedName("do.f(Ljava/lang/String;II)Z")
    public static boolean method2278(String arg0, int arg1) {
        return method2655(arg0, arg1, "openjs");
    }

    @ObfuscatedName("df.s(Ljava/lang/String;ILjava/lang/String;S)Z")
    public static boolean method2655(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2124.startsWith("win")) {
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
                Applet var6 = field2127;
                Object[] var7 = new Object[] { (new URL(field2127.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2127.getAppletContext().showDocument(new URL(field2127.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class132.method2680(field2127, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field2127.getAppletContext().showDocument(new URL(field2127.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
