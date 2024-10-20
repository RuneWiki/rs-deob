package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("at")
public class class46 {

    @ObfuscatedName("at.f")
    public static Applet field382 = null;

    @ObfuscatedName("at.h")
    public static String field377 = "";

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ia.f(Ljava/lang/String;ZZI)V")
    public static void method4235(String arg0, boolean arg1, boolean arg2) {
        method128(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("r.h(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method128(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method5103(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field377.startsWith("win") && !arg3) {
            method5103(arg0, 0, "openjs");
            return;
        }
        if (field377.startsWith("mac")) {
            method5103(arg0, 1, arg2);
            return;
        }
        method5103(arg0, 2, "openjs");
    }

    @ObfuscatedName("kn.e(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method5103(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field377.startsWith("win")) {
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
                Applet var6 = field382;
                Object[] var7 = new Object[] { (new URL(field382.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field382.getAppletContext().showDocument(new URL(field382.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field382;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field382.getAppletContext().showDocument(new URL(field382.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
