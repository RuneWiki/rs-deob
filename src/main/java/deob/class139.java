package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("ep")
public class class139 {

    @ObfuscatedName("ep.t")
    public static Applet field2157 = null;

    @ObfuscatedName("ep.i")
    public static String field2156 = null;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.i(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method2926(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2098(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2156.startsWith("win") && !arg3) {
            method2098(arg0, 0);
            return;
        }
        if (field2156.startsWith("mac")) {
            method3428(arg0, 1, arg2);
            return;
        }
        method2098(arg0, 2);
    }

    @ObfuscatedName("dw.g(Ljava/lang/String;IS)Z")
    public static boolean method2098(String arg0, int arg1) {
        return method3428(arg0, arg1, "openjs");
    }

    @ObfuscatedName("gx.h(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method3428(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2156.startsWith("win")) {
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
                Object var6 = class133.method2655(field2157, arg2, new Object[] { (new URL(field2157.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2157.getAppletContext().showDocument(new URL(field2157.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class133.method2647(field2157, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2157.getAppletContext().showDocument(new URL(field2157.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
