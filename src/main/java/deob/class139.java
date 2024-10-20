package deob;

import java.applet.Applet;
import java.net.URL;

@ObfuscatedName("ee")
public class class139 {

    @ObfuscatedName("ee.b")
    public static Applet field2123 = null;

    @ObfuscatedName("ee.g")
    public static String field2113 = null;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.b(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2266(Applet arg0, String arg1) {
        field2123 = arg0;
        field2113 = arg1;
    }

    @ObfuscatedName("m.j(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method564(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2113.startsWith("win")) {
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
                Object var6 = class133.method2704(field2123, arg2, new Object[] { (new URL(field2123.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2123.getAppletContext().showDocument(new URL(field2123.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class133.method2703(field2123, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2123.getAppletContext().showDocument(new URL(field2123.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
