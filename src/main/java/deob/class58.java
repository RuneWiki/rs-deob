package deob;

import java.applet.Applet;
import java.net.URL;

@ObfuscatedName("bs")
public class class58 {

    @ObfuscatedName("bs.o")
    public static Applet field675 = null;

    @ObfuscatedName("bs.k")
    public static String field668 = "";

    public class58() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.o(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method65(Applet arg0, String arg1) {
        field675 = arg0;
        if (arg1 != null) {
            field668 = arg1;
        }
    }

    @ObfuscatedName("gc.k(Ljava/lang/String;IB)Z")
    public static boolean method3415(String arg0, int arg1) {
        return method1716(arg0, arg1, "openjs");
    }

    @ObfuscatedName("cb.t(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method1716(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field668.startsWith("win")) {
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
                Object var6 = class54.method707(field675, arg2, new Object[] { (new URL(field675.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field675.getAppletContext().showDocument(new URL(field675.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class54.method711(field675, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field675.getAppletContext().showDocument(new URL(field675.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
