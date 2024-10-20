package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("et")
public class class138 {

    @ObfuscatedName("et.j")
    public static Applet field2117 = null;

    @ObfuscatedName("et.m")
    public static String field2118 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.j(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2170(Applet arg0, String arg1) {
        field2117 = arg0;
        field2118 = arg1;
    }

    @ObfuscatedName("fj.m(Ljava/lang/String;ZZB)V")
    public static void method2983(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method2652(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field2118.startsWith("win") && !arg2) {
            method2652(arg0, 0);
        } else if (field2118.startsWith("mac")) {
            method153(arg0, 1, "openjs");
        } else {
            method2652(arg0, 2);
        }
    }

    @ObfuscatedName("dp.f(Ljava/lang/String;II)Z")
    public static boolean method2652(String arg0, int arg1) {
        return method153(arg0, arg1, "openjs");
    }

    @ObfuscatedName("s.l(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method153(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2118.startsWith("win")) {
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
                Object var6 = class132.method2705(field2117, arg2, new Object[] { (new URL(field2117.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2117.getAppletContext().showDocument(new URL(field2117.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class132.method2707(field2117, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2117.getAppletContext().showDocument(new URL(field2117.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
