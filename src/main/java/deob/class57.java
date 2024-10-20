package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bp")
public class class57 {

    @ObfuscatedName("bp.b")
    public static Applet field613 = null;

    @ObfuscatedName("bp.q")
    public static String field617 = "";

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.b(Ljava/lang/String;ZZB)V")
    public static void method3129(String arg0, boolean arg1, boolean arg2) {
        method2668(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ei.q(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2668(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method136(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field617.startsWith("win") && !arg3) {
            method136(arg0, 0);
            return;
        }
        if (field617.startsWith("mac")) {
            method4435(arg0, 1, arg2);
            return;
        }
        method136(arg0, 2);
    }

    @ObfuscatedName("w.o(Ljava/lang/String;II)Z")
    public static boolean method136(String arg0, int arg1) {
        return method4435(arg0, arg1, "openjs");
    }

    @ObfuscatedName("je.p(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method4435(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field617.startsWith("win")) {
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
                Object var6 = class53.method705(field613, arg2, new Object[] { (new URL(field613.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field613.getAppletContext().showDocument(new URL(field613.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field613;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field613.getAppletContext().showDocument(new URL(field613.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
