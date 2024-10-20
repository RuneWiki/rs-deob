package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ew")
public class class133 {

    @ObfuscatedName("ew.j")
    public static Applet field2030 = null;

    @ObfuscatedName("ew.y")
    public static String field2021 = null;

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.j(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method149(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2021.startsWith("win")) {
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
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field2030;
                Object[] var7 = new Object[] { (new URL(field2030.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2030.getAppletContext().showDocument(new URL(field2030.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field2030;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field2030.getAppletContext().showDocument(new URL(field2030.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
