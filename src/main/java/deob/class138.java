package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("el")
public class class138 {

    @ObfuscatedName("el.g")
    public static Applet field2129 = null;

    @ObfuscatedName("el.b")
    public static String field2128 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.g(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method596(Applet arg0, String arg1) {
        field2129 = arg0;
        field2128 = arg1;
    }

    @ObfuscatedName("as.b(Ljava/lang/String;II)Z")
    public static boolean method1029(String arg0, int arg1) {
        return method728(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ad.w(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method728(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2128.startsWith("win")) {
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
                Applet var6 = field2129;
                Object[] var7 = new Object[] { (new URL(field2129.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2129.getAppletContext().showDocument(new URL(field2129.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class132.method2711(field2129, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field2129.getAppletContext().showDocument(new URL(field2129.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
