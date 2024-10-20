package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("ei")
public class class142 {

    @ObfuscatedName("ei.x")
    public static Applet field2194 = null;

    @ObfuscatedName("ei.r")
    public static String field2185 = null;

    public class142() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.x(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method868(Applet arg0, String arg1) {
        field2194 = arg0;
        field2185 = arg1;
    }

    @ObfuscatedName("db.r(Ljava/lang/String;ZZI)V")
    public static void method2338(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method739(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field2185.startsWith("win") && !arg2) {
            method739(arg0, 0, "openjs");
        } else if (field2185.startsWith("mac")) {
            method739(arg0, 1, "openjs");
        } else {
            method739(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("ad.j(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method739(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2185.startsWith("win")) {
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
                Object var6 = Statics.method2743(field2194, arg2, new Object[] { (new URL(field2194.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2194.getAppletContext().showDocument(new URL(field2194.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field2194;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field2194.getAppletContext().showDocument(new URL(field2194.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
