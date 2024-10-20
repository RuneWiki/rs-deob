package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("au")
public class class46 {

    @ObfuscatedName("au.c")
    public static Applet field419 = null;

    @ObfuscatedName("au.q")
    public static String field412 = "";

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.c(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method106(Applet arg0, String arg1) {
        field419 = arg0;
        if (arg1 != null) {
            field412 = arg1;
        }
    }

    @ObfuscatedName("fr.q(Ljava/lang/String;ZZI)V")
    public static void method3140(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method2945(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field412.startsWith("win") && !arg2) {
            method2945(arg0, 0);
        } else if (field412.startsWith("mac")) {
            method4197(arg0, 1, "openjs");
        } else {
            method2945(arg0, 2);
        }
    }

    @ObfuscatedName("ei.m(Ljava/lang/String;IB)Z")
    public static boolean method2945(String arg0, int arg1) {
        return method4197(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ik.j(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method4197(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field412.startsWith("win")) {
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
                Applet var6 = field419;
                Object[] var7 = new Object[] { (new URL(field419.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field419.getAppletContext().showDocument(new URL(field419.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field419;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field419.getAppletContext().showDocument(new URL(field419.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
