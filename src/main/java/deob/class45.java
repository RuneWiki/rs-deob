package deob;

import java.applet.Applet;
import java.net.URL;

@ObfuscatedName("ab")
public class class45 {

    @ObfuscatedName("ab.f")
    public static Applet field294 = null;

    @ObfuscatedName("ab.o")
    public static String field295 = "";

    public class45() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ku.f(Ljava/lang/String;ZZI)V")
    public static void method4915(String arg0, boolean arg1, boolean arg2) {
        Statics.method3683(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ki.u(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method5024(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field295.startsWith("win")) {
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
                Object var6 = class43.method335(field294, arg2, new Object[] { (new URL(field294.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field294.getAppletContext().showDocument(new URL(field294.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class43.method333(field294, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field294.getAppletContext().showDocument(new URL(field294.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
