package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bg")
public class class57 {

    @ObfuscatedName("bg.a")
    public static Applet field623 = null;

    @ObfuscatedName("bg.w")
    public static String field622 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.a(Ljava/lang/String;II)Z")
    public static boolean method667(String arg0, int arg1) {
        return method456(arg0, arg1, "openjs");
    }

    @ObfuscatedName("an.w(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method456(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field622.startsWith("win")) {
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
                Applet var6 = field623;
                Object[] var7 = new Object[] { (new URL(field623.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field623.getAppletContext().showDocument(new URL(field623.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class53.method656(field623, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field623.getAppletContext().showDocument(new URL(field623.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
