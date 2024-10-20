package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("as")
public class class52 {

    @ObfuscatedName("as.a")
    public static Applet field411 = null;

    @ObfuscatedName("as.t")
    public static String field417 = "";

    public class52() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ip.a(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method4031(Applet arg0, String arg1) {
        field411 = arg0;
        if (arg1 != null) {
            field417 = arg1;
        }
    }

    @ObfuscatedName("n.t(Ljava/lang/String;ZZI)V")
    public static void method27(String arg0, boolean arg1, boolean arg2) {
        method2191(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("cp.n(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2191(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method3854(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field417.startsWith("win") && !arg3) {
            method3854(arg0, 0, "openjs");
            return;
        }
        if (field417.startsWith("mac")) {
            method3854(arg0, 1, arg2);
            return;
        }
        method3854(arg0, 2, "openjs");
    }

    @ObfuscatedName("hc.q(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method3854(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field417.startsWith("win")) {
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
                Applet var6 = field411;
                Object[] var7 = new Object[] { (new URL(field411.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field411.getAppletContext().showDocument(new URL(field411.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class48.method749(field411, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field411.getAppletContext().showDocument(new URL(field411.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
