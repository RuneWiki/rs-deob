package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("ar")
public class class30 {

    @ObfuscatedName("ar.c")
    public static Applet field180 = null;

    @ObfuscatedName("ar.p")
    public static String field173 = "";

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.c(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method113(Applet arg0, String arg1) {
        field180 = arg0;
        if (arg1 != null) {
            field173 = arg1;
        }
    }

    @ObfuscatedName("gj.p(Ljava/lang/String;ZZI)V")
    public static void method3656(String arg0, boolean arg1, boolean arg2) {
        method585(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ai.f(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method585(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2139(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field173.startsWith("win") && !arg3) {
            method2139(arg0, 0, "openjs");
            return;
        }
        if (field173.startsWith("mac")) {
            method2139(arg0, 1, arg2);
            return;
        }
        method2139(arg0, 2, "openjs");
    }

    @ObfuscatedName("cy.n(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method2139(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field173.startsWith("win")) {
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
                Object var6 = class28.method399(field180, arg2, new Object[] { (new URL(field180.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field180.getAppletContext().showDocument(new URL(field180.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Statics.method398(field180, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field180.getAppletContext().showDocument(new URL(field180.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
