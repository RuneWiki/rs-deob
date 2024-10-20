package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bg")
public class class32 {

    @ObfuscatedName("bg.at")
    public static Applet field163 = null;

    @ObfuscatedName("bg.an")
    public static String field161 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mm.at(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method5421(Applet arg0, String arg1) {
        field163 = arg0;
        if (arg1 != null) {
            field161 = arg1;
        }
    }

    @ObfuscatedName("bc.an(Ljava/lang/String;ZZS)V")
    public static void method400(String arg0, boolean arg1, boolean arg2) {
        Statics.method2499(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ac.as(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method176(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field161.startsWith("win")) {
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
                Applet var6 = field163;
                Object[] var7 = new Object[] { (new URL(field163.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field163.getAppletContext().showDocument(new URL(field163.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class27.method371(field163, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field163.getAppletContext().showDocument(new URL(field163.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
