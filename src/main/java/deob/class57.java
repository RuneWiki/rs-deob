package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bf")
public class class57 {

    @ObfuscatedName("bf.p")
    public static Applet field621 = null;

    @ObfuscatedName("bf.i")
    public static String field618 = "";

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.p(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method333(Applet arg0, String arg1) {
        field621 = arg0;
        if (arg1 != null) {
            field618 = arg1;
        }
    }

    @ObfuscatedName("f.i(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method145(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method4980(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field618.startsWith("win") && !arg3) {
            method4980(arg0, 0, "openjs");
            return;
        }
        if (field618.startsWith("mac")) {
            method4980(arg0, 1, arg2);
            return;
        }
        method4980(arg0, 2, "openjs");
    }

    @ObfuscatedName("kw.w(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method4980(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field618.startsWith("win")) {
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
                Applet var6 = field621;
                Object[] var7 = new Object[] { (new URL(field621.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field621.getAppletContext().showDocument(new URL(field621.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class53.method673(field621, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field621.getAppletContext().showDocument(new URL(field621.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
