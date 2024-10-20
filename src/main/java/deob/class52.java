package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ae")
public class class52 {

    @ObfuscatedName("ae.s")
    public static Applet field406 = null;

    @ObfuscatedName("ae.j")
    public static String field405 = "";

    public class52() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.s(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method1100(Applet arg0, String arg1) {
        field406 = arg0;
        if (arg1 != null) {
            field405 = arg1;
        }
    }

    @ObfuscatedName("ej.j(Ljava/lang/String;ZZI)V")
    public static void method3044(String arg0, boolean arg1, boolean arg2) {
        method3758(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("hv.i(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method3758(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method86(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field405.startsWith("win") && !arg3) {
            method86(arg0, 0);
            return;
        }
        if (field405.startsWith("mac")) {
            method209(arg0, 1, arg2);
            return;
        }
        method209(arg0, 2, "openjs");
    }

    @ObfuscatedName("d.k(Ljava/lang/String;II)Z")
    public static boolean method86(String arg0, int arg1) {
        return method209(arg0, arg1, "openjs");
    }

    @ObfuscatedName("a.u(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method209(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field405.startsWith("win")) {
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
                Object var6 = class48.method672(field406, arg2, new Object[] { (new URL(field406.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field406.getAppletContext().showDocument(new URL(field406.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field406;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field406.getAppletContext().showDocument(new URL(field406.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
