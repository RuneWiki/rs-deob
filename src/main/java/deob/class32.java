package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bv")
public class class32 {

    @ObfuscatedName("bv.ac")
    public static Applet field172 = null;

    @ObfuscatedName("bv.al")
    public static String field171 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("qi.ac(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method7067(Applet arg0, String arg1) {
        field172 = arg0;
        if (arg1 != null) {
            field171 = arg1;
        }
    }

    @ObfuscatedName("jp.al(Ljava/lang/String;ZZI)V")
    public static void method4708(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method7304(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field171.startsWith("win") && !arg2) {
            method7304(arg0, 0, "openjs");
        } else if (field171.startsWith("mac")) {
            method7304(arg0, 1, "openjs");
        } else {
            method7304(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("rq.ak(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method7304(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field171.startsWith("win")) {
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
                Applet var6 = field172;
                Object[] var7 = new Object[] { (new URL(field172.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field172.getAppletContext().showDocument(new URL(field172.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field172;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field172.getAppletContext().showDocument(new URL(field172.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
