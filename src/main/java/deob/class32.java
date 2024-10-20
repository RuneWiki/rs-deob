package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bb")
public class class32 {

    @ObfuscatedName("bb.ap")
    public static Applet field136 = null;

    @ObfuscatedName("bb.aw")
    public static String field135 = "";

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pc.ap(Ljava/lang/String;ZZB)V")
    public static void method7129(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method2495(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field135.startsWith("win") && !arg2) {
            method2495(arg0, 0);
        } else if (field135.startsWith("mac")) {
            method274(arg0, 1, "openjs");
        } else {
            method2495(arg0, 2);
        }
    }

    @ObfuscatedName("ds.aw(Ljava/lang/String;IB)Z")
    public static boolean method2495(String arg0, int arg1) {
        return method274(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ad.ak(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method274(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field135.startsWith("win")) {
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
                Object var6 = class27.method382(field136, arg2, new Object[] { (new URL(field136.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field136.getAppletContext().showDocument(new URL(field136.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field136;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field136.getAppletContext().showDocument(new URL(field136.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
