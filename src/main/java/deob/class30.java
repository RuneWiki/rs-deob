package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("aj")
public class class30 {

    @ObfuscatedName("aj.s")
    public static Applet field175 = null;

    @ObfuscatedName("aj.h")
    public static String field168 = "";

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oz.s(Ljava/lang/String;ZZI)V")
    public static void method6381(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method5978(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field168.startsWith("win") && !arg2) {
            method5978(arg0, 0, "openjs");
        } else if (field168.startsWith("mac")) {
            method5978(arg0, 1, "openjs");
        } else {
            method5978(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("ns.h(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method5978(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field168.startsWith("win")) {
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
                Applet var6 = field175;
                Object[] var7 = new Object[] { (new URL(field175.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field175.getAppletContext().showDocument(new URL(field175.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Statics.method379(field175, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field175.getAppletContext().showDocument(new URL(field175.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
