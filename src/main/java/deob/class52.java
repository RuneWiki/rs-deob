package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("au")
public class class52 {

    @ObfuscatedName("au.c")
    public static Applet field414 = null;

    @ObfuscatedName("au.x")
    public static String field407 = "";

    public class52() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.c(Ljava/lang/String;ZZI)V")
    public static void method183(String arg0, boolean arg1, boolean arg2) {
        Statics.method629(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("kn.t(Ljava/lang/String;II)Z")
    public static boolean method4935(String arg0, int arg1) {
        return method2110(arg0, arg1, "openjs");
    }

    @ObfuscatedName("cf.g(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method2110(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field407.startsWith("win")) {
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
            } catch (Throwable var14) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field414;
                Object[] var7 = new Object[] { (new URL(field414.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field414.getAppletContext().showDocument(new URL(field414.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class48.method686(field414, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field414.getAppletContext().showDocument(new URL(field414.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
