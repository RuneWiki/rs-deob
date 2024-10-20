package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("by")
public class class57 {

    @ObfuscatedName("by.j")
    public static Applet field679 = null;

    @ObfuscatedName("by.h")
    public static String field687 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.j(Ljava/lang/String;ZZI)V")
    public static void method253(String arg0, boolean arg1, boolean arg2) {
        method59(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("i.h(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method59(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2299(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field687.startsWith("win") && !arg3) {
            method2299(arg0, 0);
            return;
        }
        if (field687.startsWith("mac")) {
            method36(arg0, 1, arg2);
            return;
        }
        method2299(arg0, 2);
    }

    @ObfuscatedName("eb.f(Ljava/lang/String;IB)Z")
    public static boolean method2299(String arg0, int arg1) {
        return method36(arg0, arg1, "openjs");
    }

    @ObfuscatedName("b.p(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method36(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field687.startsWith("win")) {
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
                Object var6 = class53.method704(field679, arg2, new Object[] { (new URL(field679.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field679.getAppletContext().showDocument(new URL(field679.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class53.method703(field679, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field679.getAppletContext().showDocument(new URL(field679.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
