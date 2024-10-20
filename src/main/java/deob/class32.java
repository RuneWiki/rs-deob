package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bm")
public class class32 {

    @ObfuscatedName("bm.ab")
    public static Applet field139 = null;

    @ObfuscatedName("bm.ay")
    public static String field144 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("uy.ab(Ljava/applet/Applet;Ljava/lang/String;S)V")
    public static void method8658(Applet arg0, String arg1) {
        field139 = arg0;
        if (arg1 != null) {
            field144 = arg1;
        }
    }

    @ObfuscatedName("kr.ay(Ljava/lang/String;ZZI)V")
    public static void method4914(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method6795(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field144.startsWith("win") && !arg2) {
            method6795(arg0, 0, "openjs");
        } else if (field144.startsWith("mac")) {
            method6795(arg0, 1, "openjs");
        } else {
            method6795(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("pj.an(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method6795(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field144.startsWith("win")) {
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
                Applet var6 = field139;
                Object[] var7 = new Object[] { (new URL(field139.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field139.getAppletContext().showDocument(new URL(field139.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field139;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field139.getAppletContext().showDocument(new URL(field139.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
