package deob;

import java.applet.Applet;
import java.net.URL;

@ObfuscatedName("bb")
public class class57 {

    @ObfuscatedName("bb.b")
    public static Applet field631 = null;

    @ObfuscatedName("bb.s")
    public static String field630 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.b(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method36(Applet arg0, String arg1) {
        field631 = arg0;
        field630 = arg1;
    }

    @ObfuscatedName("cg.s(Ljava/lang/String;IB)Z")
    public static boolean method1447(String arg0, int arg1) {
        return method917(arg0, arg1, "openjs");
    }

    @ObfuscatedName("br.r(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method917(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field630.startsWith("win")) {
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
                Object var6 = class53.method647(field631, arg2, new Object[] { (new URL(field631.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field631.getAppletContext().showDocument(new URL(field631.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class53.method643(field631, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field631.getAppletContext().showDocument(new URL(field631.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
