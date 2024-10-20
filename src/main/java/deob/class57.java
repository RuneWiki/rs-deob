package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bl")
public class class57 {

    @ObfuscatedName("bl.a")
    public static Applet field675 = null;

    @ObfuscatedName("bl.j")
    public static String field668 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.a(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method1589(Applet arg0, String arg1) {
        field675 = arg0;
        field668 = arg1;
    }

    @ObfuscatedName("ch.n(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method1518(String arg0, int arg1, String arg2) {
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
            } catch (Throwable var14) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field675;
                Object[] var7 = new Object[] { (new URL(field675.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field675.getAppletContext().showDocument(new URL(field675.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class53.method670(field675, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field675.getAppletContext().showDocument(new URL(field675.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
