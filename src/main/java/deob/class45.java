package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ay")
public class class45 {

    @ObfuscatedName("ay.f")
    public static Applet field312 = null;

    @ObfuscatedName("ay.e")
    public static String field310 = "";

    public class45() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.f(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2265(Applet arg0, String arg1) {
        field312 = arg0;
        if (arg1 != null) {
            field310 = arg1;
        }
    }

    @ObfuscatedName("dh.e(Ljava/lang/String;ZZB)V")
    public static void method2107(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method4429(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field310.startsWith("win") && !arg2) {
            method4429(arg0, 0);
        } else if (field310.startsWith("mac")) {
            method2018(arg0, 1, "openjs");
        } else {
            method4429(arg0, 2);
        }
    }

    @ObfuscatedName("jl.v(Ljava/lang/String;IS)Z")
    public static boolean method4429(String arg0, int arg1) {
        return method2018(arg0, arg1, "openjs");
    }

    @ObfuscatedName("cw.y(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2018(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field310.startsWith("win")) {
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
                Applet var6 = field312;
                Object[] var7 = new Object[] { (new URL(field312.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field312.getAppletContext().showDocument(new URL(field312.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class43.method358(field312, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field312.getAppletContext().showDocument(new URL(field312.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
