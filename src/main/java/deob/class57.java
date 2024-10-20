package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bz")
public class class57 {

    @ObfuscatedName("bz.p")
    public static Applet field689 = null;

    @ObfuscatedName("bz.m")
    public static String field688 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.p(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method1568(Applet arg0, String arg1) {
        field689 = arg0;
        field688 = arg1;
    }

    @ObfuscatedName("h.m(Ljava/lang/String;ZZI)V")
    public static void method155(String arg0, boolean arg1, boolean arg2) {
        method2402(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("eu.e(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2402(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method656(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field688.startsWith("win") && !arg3) {
            method656(arg0, 0, "openjs");
            return;
        }
        if (field688.startsWith("mac")) {
            method656(arg0, 1, arg2);
            return;
        }
        method656(arg0, 2, "openjs");
    }

    @ObfuscatedName("ad.t(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method656(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field688.startsWith("win")) {
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
                Object var6 = class53.method664(field689, arg2, new Object[] { (new URL(field689.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field689.getAppletContext().showDocument(new URL(field689.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field689;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field689.getAppletContext().showDocument(new URL(field689.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
