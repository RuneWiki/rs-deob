package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("au")
public class class46 {

    @ObfuscatedName("au.f")
    public static Applet field415 = null;

    @ObfuscatedName("au.l")
    public static String field409 = "";

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.f(Ljava/applet/Applet;Ljava/lang/String;S)V")
    public static void method459(Applet arg0, String arg1) {
        field415 = arg0;
        if (arg1 != null) {
            field409 = arg1;
        }
    }

    @ObfuscatedName("li.l(Ljava/lang/String;ZZB)V")
    public static void method5698(String arg0, boolean arg1, boolean arg2) {
        Statics.method656(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ie.s(Ljava/lang/String;II)Z")
    public static boolean method4276(String arg0, int arg1) {
        return method81(arg0, arg1, "openjs");
    }

    @ObfuscatedName("p.e(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method81(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field409.startsWith("win")) {
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
                Object var6 = class42.method662(field415, arg2, new Object[] { (new URL(field415.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field415.getAppletContext().showDocument(new URL(field415.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field415;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field415.getAppletContext().showDocument(new URL(field415.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
