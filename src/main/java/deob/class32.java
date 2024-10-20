package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ar")
public class class32 {

    @ObfuscatedName("ar.f")
    public static Applet field191 = null;

    @ObfuscatedName("ar.w")
    public static String field187 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hx.f(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method4300(Applet arg0, String arg1) {
        field191 = arg0;
        if (arg1 != null) {
            field187 = arg1;
        }
    }

    @ObfuscatedName("co.w(Ljava/lang/String;ZZI)V")
    public static void method2581(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method3112(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field187.startsWith("win") && !arg2) {
            method3112(arg0, 0);
        } else if (field187.startsWith("mac")) {
            method3101(arg0, 1, "openjs");
        } else {
            method3112(arg0, 2);
        }
    }

    @ObfuscatedName("fh.v(Ljava/lang/String;II)Z")
    public static boolean method3112(String arg0, int arg1) {
        return method3101(arg0, arg1, "openjs");
    }

    @ObfuscatedName("em.s(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method3101(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field187.startsWith("win")) {
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
                Applet var6 = field191;
                Object[] var7 = new Object[] { (new URL(field191.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field191.getAppletContext().showDocument(new URL(field191.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field191;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field191.getAppletContext().showDocument(new URL(field191.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
