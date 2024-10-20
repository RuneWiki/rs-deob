package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("bw")
public class class57 {

    @ObfuscatedName("bw.m")
    public static Applet field654 = null;

    @ObfuscatedName("bw.p")
    public static String field643 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.m(Ljava/lang/String;ZZI)V")
    public static void method2736(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method450(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field643.startsWith("win") && !arg2) {
            method450(arg0, 0);
        } else if (field643.startsWith("mac")) {
            method1524(arg0, 1, "openjs");
        } else {
            method450(arg0, 2);
        }
    }

    @ObfuscatedName("ak.p(Ljava/lang/String;IB)Z")
    public static boolean method450(String arg0, int arg1) {
        return method1524(arg0, arg1, "openjs");
    }

    @ObfuscatedName("cd.i(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method1524(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field643.startsWith("win")) {
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
                Object var6 = class53.method726(field654, arg2, new Object[] { (new URL(field654.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field654.getAppletContext().showDocument(new URL(field654.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class53.method728(field654, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field654.getAppletContext().showDocument(new URL(field654.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
