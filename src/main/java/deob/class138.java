package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ek")
public class class138 {

    @ObfuscatedName("ek.h")
    public static Applet field2114 = null;

    @ObfuscatedName("ek.q")
    public static String field2120 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.h(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method938(Applet arg0, String arg1) {
        field2114 = arg0;
        field2120 = arg1;
    }

    @ObfuscatedName("bs.v(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method1054(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2120.startsWith("win")) {
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
                Object var6 = class132.method2728(field2114, arg2, new Object[] { (new URL(field2114.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2114.getAppletContext().showDocument(new URL(field2114.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field2114;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field2114.getAppletContext().showDocument(new URL(field2114.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
