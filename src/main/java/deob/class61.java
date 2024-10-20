package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bp")
public class class61 {

    @ObfuscatedName("bp.z")
    public static Applet field451 = null;

    @ObfuscatedName("bp.k")
    public static String field452 = "";

    public class61() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iy.z(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method4209(Applet arg0, String arg1) {
        field451 = arg0;
        if (arg1 != null) {
            field452 = arg1;
        }
    }

    @ObfuscatedName("jy.k(Ljava/lang/String;ZZI)V")
    public static void method4704(String arg0, boolean arg1, boolean arg2) {
        Statics.method221(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("kz.t(Ljava/lang/String;II)Z")
    public static boolean method5028(String arg0, int arg1) {
        return method324(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ap.i(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method324(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field452.startsWith("win")) {
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
                Object var6 = class57.method755(field451, arg2, new Object[] { (new URL(field451.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field451.getAppletContext().showDocument(new URL(field451.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field451;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field451.getAppletContext().showDocument(new URL(field451.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
