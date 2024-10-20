package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("ah")
public class class52 {

    @ObfuscatedName("ah.u")
    public static Applet field431 = null;

    @ObfuscatedName("ah.f")
    public static String field425 = "";

    public class52() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.u(Ljava/lang/String;ZZI)V")
    public static void method582(String arg0, boolean arg1, boolean arg2) {
        method3392(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("gw.f(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method3392(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method1856(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field425.startsWith("win") && !arg3) {
            method1856(arg0, 0);
            return;
        }
        if (field425.startsWith("mac")) {
            method4022(arg0, 1, arg2);
            return;
        }
        method1856(arg0, 2);
    }

    @ObfuscatedName("bk.b(Ljava/lang/String;II)Z")
    public static boolean method1856(String arg0, int arg1) {
        return method4022(arg0, arg1, "openjs");
    }

    @ObfuscatedName("if.g(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method4022(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field425.startsWith("win")) {
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
            } catch (Throwable var11) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class48.method714(field431, arg2, new Object[] { (new URL(field431.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field431.getAppletContext().showDocument(new URL(field431.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Statics.method713(field431, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field431.getAppletContext().showDocument(new URL(field431.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
