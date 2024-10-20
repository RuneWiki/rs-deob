package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bo")
public class class57 {

    @ObfuscatedName("bo.w")
    public static Applet field707 = null;

    @ObfuscatedName("bo.o")
    public static String field697 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("is.w(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method3716(Applet arg0, String arg1) {
        field707 = arg0;
        field697 = arg1;
    }

    @ObfuscatedName("ah.o(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method627(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method136(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field697.startsWith("win") && !arg3) {
            method136(arg0, 0, "openjs");
            return;
        }
        if (field697.startsWith("mac")) {
            method136(arg0, 1, arg2);
            return;
        }
        method2806(arg0, 2);
    }

    @ObfuscatedName("fr.x(Ljava/lang/String;II)Z")
    public static boolean method2806(String arg0, int arg1) {
        return method136(arg0, arg1, "openjs");
    }

    @ObfuscatedName("e.k(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method136(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field697.startsWith("win")) {
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
                Applet var6 = field707;
                Object[] var7 = new Object[] { (new URL(field707.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field707.getAppletContext().showDocument(new URL(field707.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field707;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field707.getAppletContext().showDocument(new URL(field707.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
