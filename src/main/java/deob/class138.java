package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("ee")
public class class138 {

    @ObfuscatedName("ee.n")
    public static Applet field2118 = null;

    @ObfuscatedName("ee.d")
    public static String field2113 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.n(Ljava/lang/String;ZZI)V")
    public static void method932(String arg0, boolean arg1, boolean arg2) {
        method14(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("d.d(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method14(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method698(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2113.startsWith("win") && !arg3) {
            method698(arg0, 0, "openjs");
            return;
        }
        if (field2113.startsWith("mac")) {
            method698(arg0, 1, arg2);
            return;
        }
        method698(arg0, 2, "openjs");
    }

    @ObfuscatedName("al.s(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method698(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2113.startsWith("win")) {
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
                Object var6 = class132.method2675(field2118, arg2, new Object[] { (new URL(field2118.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2118.getAppletContext().showDocument(new URL(field2118.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class132.method2669(field2118, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2118.getAppletContext().showDocument(new URL(field2118.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
