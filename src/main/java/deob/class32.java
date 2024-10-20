package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bd")
public class class32 {

    @ObfuscatedName("bd.au")
    public static Applet field171 = null;

    @ObfuscatedName("bd.ae")
    public static String field170 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.au(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method369(Applet arg0, String arg1) {
        field171 = arg0;
        if (arg1 != null) {
            field170 = arg1;
        }
    }

    @ObfuscatedName("bt.ae(Ljava/lang/String;ZZB)V")
    public static void method446(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method4663(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field170.startsWith("win") && !arg2) {
            method4663(arg0, 0);
        } else if (field170.startsWith("mac")) {
            method5210(arg0, 1, "openjs");
        } else {
            method4663(arg0, 2);
        }
    }

    @ObfuscatedName("jo.ao(Ljava/lang/String;II)Z")
    public static boolean method4663(String arg0, int arg1) {
        return method5210(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ln.at(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method5210(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field170.startsWith("win")) {
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
                Object var6 = class27.method375(field171, arg2, new Object[] { (new URL(field171.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field171.getAppletContext().showDocument(new URL(field171.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field171;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field171.getAppletContext().showDocument(new URL(field171.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
