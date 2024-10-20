package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bg")
public class class57 {

    @ObfuscatedName("bg.c")
    public static Applet field675 = null;

    @ObfuscatedName("bg.o")
    public static String field676 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.c(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method453(Applet arg0, String arg1) {
        field675 = arg0;
        field676 = arg1;
    }

    @ObfuscatedName("at.o(Ljava/lang/String;ZZI)V")
    public static void method457(String arg0, boolean arg1, boolean arg2) {
        method3693(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("hi.i(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method3693(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2622(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field676.startsWith("win") && !arg3) {
            method2622(arg0, 0, "openjs");
            return;
        }
        if (field676.startsWith("mac")) {
            method2622(arg0, 1, arg2);
            return;
        }
        method2622(arg0, 2, "openjs");
    }

    @ObfuscatedName("eu.u(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2622(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field676.startsWith("win")) {
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
                Applet var6 = field675;
                Object[] var7 = new Object[] { (new URL(field675.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field675.getAppletContext().showDocument(new URL(field675.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field675;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field675.getAppletContext().showDocument(new URL(field675.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
