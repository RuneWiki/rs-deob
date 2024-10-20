package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("bt")
public class class57 {

    @ObfuscatedName("bt.i")
    public static Applet field700 = null;

    @ObfuscatedName("bt.w")
    public static String field706 = null;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.i(Ljava/lang/String;ZZI)V")
    public static void method1066(String arg0, boolean arg1, boolean arg2) {
        method123(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("n.w(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method123(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method131(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field706.startsWith("win") && !arg3) {
            method131(arg0, 0);
            return;
        }
        if (field706.startsWith("mac")) {
            method3648(arg0, 1, arg2);
            return;
        }
        method131(arg0, 2);
    }

    @ObfuscatedName("u.a(Ljava/lang/String;II)Z")
    public static boolean method131(String arg0, int arg1) {
        return method3648(arg0, arg1, "openjs");
    }

    @ObfuscatedName("hz.t(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method3648(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field706.startsWith("win")) {
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
                Object var6 = class53.method687(field700, arg2, new Object[] { (new URL(field700.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field700.getAppletContext().showDocument(new URL(field700.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field700;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field700.getAppletContext().showDocument(new URL(field700.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
