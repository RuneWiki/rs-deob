package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bn")
public class class32 {

    @ObfuscatedName("bn.ak")
    public static Applet field166 = null;

    @ObfuscatedName("bn.al")
    public static String field163 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("od.ak(Ljava/lang/String;ZZI)V")
    public static void method6508(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method7453(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field163.startsWith("win") && !arg2) {
            method7453(arg0, 0, "openjs");
        } else if (field163.startsWith("mac")) {
            method7453(arg0, 1, "openjs");
        } else {
            method7453(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("qs.al(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method7453(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field163.startsWith("win")) {
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
                Applet var6 = field166;
                Object[] var7 = new Object[] { (new URL(field166.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field166.getAppletContext().showDocument(new URL(field166.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class27.method371(field166, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field166.getAppletContext().showDocument(new URL(field166.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
