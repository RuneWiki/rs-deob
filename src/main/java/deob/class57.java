package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bs")
public class class57 {

    @ObfuscatedName("bs.w")
    public static Applet field694 = null;

    @ObfuscatedName("bs.s")
    public static String field693 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.w(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method1597(Applet arg0, String arg1) {
        field694 = arg0;
        field693 = arg1;
    }

    @ObfuscatedName("ee.s(Ljava/lang/String;ZZI)V")
    public static void method2765(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method4247(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field693.startsWith("win") && !arg2) {
            method4247(arg0, 0);
        } else if (field693.startsWith("mac")) {
            method4648(arg0, 1, "openjs");
        } else {
            method4247(arg0, 2);
        }
    }

    @ObfuscatedName("ic.q(Ljava/lang/String;II)Z")
    public static boolean method4247(String arg0, int arg1) {
        return method4648(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ja.o(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method4648(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field693.startsWith("win")) {
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
                Object var6 = class53.method676(field694, arg2, new Object[] { (new URL(field694.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field694.getAppletContext().showDocument(new URL(field694.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field694;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field694.getAppletContext().showDocument(new URL(field694.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
