package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bv")
public class class57 {

    @ObfuscatedName("bv.i")
    public static Applet field698 = null;

    @ObfuscatedName("bv.j")
    public static String field693 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hk.i(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method3815(Applet arg0, String arg1) {
        field698 = arg0;
        field693 = arg1;
    }

    @ObfuscatedName("az.j(Ljava/lang/String;ZZI)V")
    public static void method476(String arg0, boolean arg1, boolean arg2) {
        method562(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ah.a(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method562(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method1542(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field693.startsWith("win") && !arg3) {
            method1542(arg0, 0);
            return;
        }
        if (field693.startsWith("mac")) {
            method2744(arg0, 1, arg2);
            return;
        }
        method1542(arg0, 2);
    }

    @ObfuscatedName("cf.r(Ljava/lang/String;II)Z")
    public static boolean method1542(String arg0, int arg1) {
        return method2744(arg0, arg1, "openjs");
    }

    @ObfuscatedName("en.o(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method2744(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field693.startsWith("win")) {
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
                Applet var6 = field698;
                Object[] var7 = new Object[] { (new URL(field698.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field698.getAppletContext().showDocument(new URL(field698.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class53.method706(field698, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field698.getAppletContext().showDocument(new URL(field698.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
