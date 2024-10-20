package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ex")
public class class138 {

    @ObfuscatedName("ex.j")
    public static Applet field2144 = null;

    @ObfuscatedName("ex.l")
    public static String field2148 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.j(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2237(Applet arg0, String arg1) {
        field2144 = arg0;
        field2148 = arg1;
    }

    @ObfuscatedName("fk.l(Ljava/lang/String;ZZI)V")
    public static void method2982(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method3(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field2148.startsWith("win") && !arg2) {
            method3(arg0, 0, "openjs");
        } else if (field2148.startsWith("mac")) {
            method3(arg0, 1, "openjs");
        } else {
            method1571(arg0, 2);
        }
    }

    @ObfuscatedName("bu.a(Ljava/lang/String;IB)Z")
    public static boolean method1571(String arg0, int arg1) {
        return method3(arg0, arg1, "openjs");
    }

    @ObfuscatedName("j.i(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method3(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2148.startsWith("win")) {
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
                Applet var6 = field2144;
                Object[] var7 = new Object[] { (new URL(field2144.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2144.getAppletContext().showDocument(new URL(field2144.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class132.method2632(field2144, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field2144.getAppletContext().showDocument(new URL(field2144.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
