package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("ad")
public class class33 {

    @ObfuscatedName("ad.a")
    public static Applet field176 = null;

    @ObfuscatedName("ad.f")
    public static String field177 = "";

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.a(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2242(Applet arg0, String arg1) {
        field176 = arg0;
        if (arg1 != null) {
            field177 = arg1;
        }
    }

    @ObfuscatedName("dk.f(Ljava/lang/String;ZZB)V")
    public static void method2572(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method7100(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field177.startsWith("win") && !arg2) {
            method7100(arg0, 0, "openjs");
        } else if (field177.startsWith("mac")) {
            method7100(arg0, 1, "openjs");
        } else {
            method7100(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("ou.c(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method7100(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field177.startsWith("win")) {
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
                Object var6 = class28.method397(field176, arg2, new Object[] { (new URL(field176.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field176.getAppletContext().showDocument(new URL(field176.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class28.method393(field176, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field176.getAppletContext().showDocument(new URL(field176.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
