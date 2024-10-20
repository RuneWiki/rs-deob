package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bp")
public class class58 {

    @ObfuscatedName("bp.g")
    public static Applet field662 = null;

    @ObfuscatedName("bp.e")
    public static String field656 = "";

    public class58() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kr.g(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method5115(Applet arg0, String arg1) {
        field662 = arg0;
        if (arg1 != null) {
            field656 = arg1;
        }
    }

    @ObfuscatedName("fd.e(Ljava/lang/String;ZZI)V")
    public static void method3072(String arg0, boolean arg1, boolean arg2) {
        method2018(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("cq.b(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2018(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method4688(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field656.startsWith("win") && !arg3) {
            method4688(arg0, 0);
            return;
        }
        if (field656.startsWith("mac")) {
            method25(arg0, 1, arg2);
            return;
        }
        method4688(arg0, 2);
    }

    @ObfuscatedName("jl.z(Ljava/lang/String;II)Z")
    public static boolean method4688(String arg0, int arg1) {
        return method25(arg0, arg1, "openjs");
    }

    @ObfuscatedName("y.n(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method25(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field656.startsWith("win")) {
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
                Applet var6 = field662;
                Object[] var7 = new Object[] { (new URL(field662.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field662.getAppletContext().showDocument(new URL(field662.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class54.method738(field662, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field662.getAppletContext().showDocument(new URL(field662.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
