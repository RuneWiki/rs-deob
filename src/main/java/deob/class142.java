package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ey")
public class class142 {

    @ObfuscatedName("ey.m")
    public static Applet field2198 = null;

    @ObfuscatedName("ey.w")
    public static String field2195 = null;

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.m(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method569(Applet arg0, String arg1) {
        field2198 = arg0;
        field2195 = arg1;
    }

    @ObfuscatedName("ft.w(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2997(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method1860(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2195.startsWith("win") && !arg3) {
            method1860(arg0, 0, "openjs");
            return;
        }
        if (field2195.startsWith("mac")) {
            method1860(arg0, 1, arg2);
            return;
        }
        method1860(arg0, 2, "openjs");
    }

    @ObfuscatedName("cl.e(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method1860(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2195.startsWith("win")) {
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
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field2198;
                Object[] var7 = new Object[] { (new URL(field2198.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2198.getAppletContext().showDocument(new URL(field2198.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field2198;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field2198.getAppletContext().showDocument(new URL(field2198.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
