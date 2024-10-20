package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("bc")
public class class58 {

    @ObfuscatedName("bc.t")
    public static Applet field636 = null;

    @ObfuscatedName("bc.q")
    public static String field637 = "";

    public class58() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.t(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2877(Applet arg0, String arg1) {
        field636 = arg0;
        if (arg1 != null) {
            field637 = arg1;
        }
    }

    @ObfuscatedName("bs.q(Ljava/lang/String;ZZI)V")
    public static void method979(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method724(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field637.startsWith("win") && !arg2) {
            method724(arg0, 0, "openjs");
        } else if (field637.startsWith("mac")) {
            method724(arg0, 1, "openjs");
        } else {
            method724(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("bg.i(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method724(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field637.startsWith("win")) {
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
                Object var6 = class54.method733(field636, arg2, new Object[] { (new URL(field636.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field636.getAppletContext().showDocument(new URL(field636.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class54.method729(field636, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field636.getAppletContext().showDocument(new URL(field636.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
