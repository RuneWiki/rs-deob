package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bb")
public class class57 {

    @ObfuscatedName("bb.i")
    public static Applet field679 = null;

    @ObfuscatedName("bb.h")
    public static String field674 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iy.i(Ljava/applet/Applet;Ljava/lang/String;S)V")
    public static void method3932(Applet arg0, String arg1) {
        field679 = arg0;
        field674 = arg1;
    }

    @ObfuscatedName("r.h(Ljava/lang/String;ZZI)V")
    public static void method40(String arg0, boolean arg1, boolean arg2) {
        method77(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("j.u(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method77(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method1639(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field674.startsWith("win") && !arg3) {
            method1639(arg0, 0, "openjs");
            return;
        }
        if (field674.startsWith("mac")) {
            method1639(arg0, 1, arg2);
            return;
        }
        method1639(arg0, 2, "openjs");
    }

    @ObfuscatedName("cr.q(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method1639(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field674.startsWith("win")) {
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
                Applet var6 = field679;
                Object[] var7 = new Object[] { (new URL(field679.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field679.getAppletContext().showDocument(new URL(field679.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field679;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field679.getAppletContext().showDocument(new URL(field679.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
