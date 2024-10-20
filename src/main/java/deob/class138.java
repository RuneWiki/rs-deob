package deob;

import java.applet.Applet;
import java.net.URL;

@ObfuscatedName("ev")
public class class138 {

    @ObfuscatedName("ev.k")
    public static Applet field2104 = null;

    @ObfuscatedName("ev.h")
    public static String field2098 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.o(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method208(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2098.startsWith("win")) {
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
                Object var6 = class132.method2664(field2104, arg2, new Object[] { (new URL(field2104.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2104.getAppletContext().showDocument(new URL(field2104.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Statics.method2668(field2104, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2104.getAppletContext().showDocument(new URL(field2104.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
