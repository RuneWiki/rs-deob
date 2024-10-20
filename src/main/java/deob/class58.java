package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("br")
public class class58 {

    @ObfuscatedName("br.c")
    public static Applet field653 = null;

    @ObfuscatedName("br.i")
    public static String field647 = "";

    public class58() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gp.c(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method3287(Applet arg0, String arg1) {
        field653 = arg0;
        if (arg1 != null) {
            field647 = arg1;
        }
    }

    @ObfuscatedName("dt.i(Ljava/lang/String;II)Z")
    public static boolean method2368(String arg0, int arg1) {
        return method498(arg0, arg1, "openjs");
    }

    @ObfuscatedName("af.o(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method498(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field647.startsWith("win")) {
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
                Object var6 = class54.method710(field653, arg2, new Object[] { (new URL(field653.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field653.getAppletContext().showDocument(new URL(field653.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field653;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field653.getAppletContext().showDocument(new URL(field653.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
