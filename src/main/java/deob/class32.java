package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bi")
public class class32 {

    @ObfuscatedName("bi.aq")
    public static Applet field155 = null;

    @ObfuscatedName("bi.ad")
    public static String field151 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("qy.aq(Ljava/lang/String;ZZI)V")
    public static void method7064(String arg0, boolean arg1, boolean arg2) {
        method5534(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ma.ad(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method5534(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method651(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field151.startsWith("win") && !arg3) {
            method651(arg0, 0, "openjs");
            return;
        }
        if (field151.startsWith("mac")) {
            method651(arg0, 1, arg2);
            return;
        }
        method651(arg0, 2, "openjs");
    }

    @ObfuscatedName("bs.ag(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method651(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field151.startsWith("win")) {
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
                Object var6 = class27.method385(field155, arg2, new Object[] { (new URL(field155.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field155.getAppletContext().showDocument(new URL(field155.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field155;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field155.getAppletContext().showDocument(new URL(field155.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
