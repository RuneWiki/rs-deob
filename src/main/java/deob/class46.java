package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("av")
public class class46 {

    @ObfuscatedName("av.w")
    public static Applet field375 = null;

    @ObfuscatedName("av.m")
    public static String field369 = "";

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.w(Ljava/lang/String;ZZI)V")
    public static void method982(String arg0, boolean arg1, boolean arg2) {
        method522(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("as.m(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method522(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method3228(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field369.startsWith("win") && !arg3) {
            method3228(arg0, 0, "openjs");
            return;
        }
        if (field369.startsWith("mac")) {
            method3228(arg0, 1, arg2);
            return;
        }
        method3228(arg0, 2, "openjs");
    }

    @ObfuscatedName("fx.q(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method3228(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field369.startsWith("win")) {
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
                Applet var6 = field375;
                Object[] var7 = new Object[] { (new URL(field375.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field375.getAppletContext().showDocument(new URL(field375.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class42.method678(field375, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field375.getAppletContext().showDocument(new URL(field375.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
