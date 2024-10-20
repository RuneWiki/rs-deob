package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("at")
public class class52 {

    @ObfuscatedName("at.z")
    public static Applet field410 = null;

    @ObfuscatedName("at.n")
    public static String field407 = "";

    public class52() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ih.z(Ljava/lang/String;ZZB)V")
    public static void method3830(String arg0, boolean arg1, boolean arg2) {
        method504(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ar.n(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method504(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            Statics.method1840(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field407.startsWith("win") && !arg3) {
            Statics.method1840(arg0, 0);
            return;
        }
        if (field407.startsWith("mac")) {
            method503(arg0, 1, arg2);
            return;
        }
        Statics.method1840(arg0, 2);
    }

    @ObfuscatedName("ar.u(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method503(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field407.startsWith("win")) {
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
                Applet var6 = field410;
                Object[] var7 = new Object[] { (new URL(field410.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field410.getAppletContext().showDocument(new URL(field410.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class48.method725(field410, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field410.getAppletContext().showDocument(new URL(field410.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
