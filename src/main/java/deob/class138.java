package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("ee")
public class class138 {

    @ObfuscatedName("ee.y")
    public static Applet field2115 = null;

    @ObfuscatedName("ee.d")
    public static String field2109 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.y(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method3066(Applet arg0, String arg1) {
        field2115 = arg0;
        field2109 = arg1;
    }

    @ObfuscatedName("dp.d(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method2244(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method633(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2109.startsWith("win") && !arg3) {
            method633(arg0, 0);
            return;
        }
        if (field2109.startsWith("mac")) {
            method695(arg0, 1, arg2);
            return;
        }
        method633(arg0, 2);
    }

    @ObfuscatedName("ai.g(Ljava/lang/String;II)Z")
    public static boolean method633(String arg0, int arg1) {
        return method695(arg0, arg1, "openjs");
    }

    @ObfuscatedName("aj.w(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method695(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2109.startsWith("win")) {
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
                Object var6 = class132.method2651(field2115, arg2, new Object[] { (new URL(field2115.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2115.getAppletContext().showDocument(new URL(field2115.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class132.method2650(field2115, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2115.getAppletContext().showDocument(new URL(field2115.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
