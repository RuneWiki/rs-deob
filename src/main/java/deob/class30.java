package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ak")
public class class30 {

    @ObfuscatedName("ak.l")
    public static Applet field169 = null;

    @ObfuscatedName("ak.q")
    public static String field166 = "";

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pt.l(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method6807(Applet arg0, String arg1) {
        field169 = arg0;
        if (arg1 != null) {
            field166 = arg1;
        }
    }

    @ObfuscatedName("cl.q(Ljava/lang/String;ZZB)V")
    public static void method2095(String arg0, boolean arg1, boolean arg2) {
        method2409(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("da.f(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method2409(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2540(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field166.startsWith("win") && !arg3) {
            method2540(arg0, 0, "openjs");
            return;
        }
        if (field166.startsWith("mac")) {
            method2540(arg0, 1, arg2);
            return;
        }
        method2540(arg0, 2, "openjs");
    }

    @ObfuscatedName("ea.j(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2540(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field166.startsWith("win")) {
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
                Object var6 = class28.method399(field169, arg2, new Object[] { (new URL(field169.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field169.getAppletContext().showDocument(new URL(field169.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field169;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field169.getAppletContext().showDocument(new URL(field169.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
