package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("al")
public class class30 {

    @ObfuscatedName("al.i")
    public static Applet field158 = null;

    @ObfuscatedName("al.w")
    public static String field159 = "";

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ku.i(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method4871(Applet arg0, String arg1) {
        field158 = arg0;
        if (arg1 != null) {
            field159 = arg1;
        }
    }

    @ObfuscatedName("cg.w(Ljava/lang/String;ZZB)V")
    public static void method2146(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method1068(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field159.startsWith("win") && !arg2) {
            method1068(arg0, 0);
        } else if (field159.startsWith("mac")) {
            method4028(arg0, 1, "openjs");
        } else {
            method1068(arg0, 2);
        }
    }

    @ObfuscatedName("bf.s(Ljava/lang/String;IB)Z")
    public static boolean method1068(String arg0, int arg1) {
        return method4028(arg0, arg1, "openjs");
    }

    @ObfuscatedName("hw.a(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method4028(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field159.startsWith("win")) {
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
                Object var6 = class28.method386(field158, arg2, new Object[] { (new URL(field158.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field158.getAppletContext().showDocument(new URL(field158.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field158;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field158.getAppletContext().showDocument(new URL(field158.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
